package coordinate;

import coordinate.controller.LineFactory;
import coordinate.controller.PointFactory;
import coordinate.controller.RectangleFactory;
import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.domain.Rectangle;
import coordinate.dto.CoordinateResult;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.List;

public class CoordinateFactory {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int FOUR = 4;

    public static void main(String[] args) {
        goCoordinate();
    }

    private static void goCoordinate(){
        try{
            List<Point> points = inputCoordinate();
            ResultView.draw(makeResultDto(points));
            goLine(points);
            goRectangle(points);
        }catch (IllegalArgumentException | IndexOutOfBoundsException e){
            reEnterCoordinate(e.getMessage());
        }
    }

    private static CoordinateResult makeResultDto(List<Point> points) {
        CoordinateResult result = new CoordinateResult();
        for (Point point : points) {
            result.add(point.pointToDto());
        }
        return result;
    }

    private static void goRectangle(List<Point> points) {
        if(RectangleFactory.isPossibleRectangle(points)){
            Rectangle rectangle = RectangleFactory.generateRectangle(points);
            ResultView.showRectangleArea(rectangle.area());
        }
    }

    private static void goLine(List<Point> points){
        if(LineFactory.isPossibleLine(points.size())){
            Line line = LineFactory.generateLine(points);
            ResultView.showLineLength(line.length());
        }
    }

    private static List<Point> inputCoordinate(){
        String[] coordinate = InputView.getCoordinate();
        return PointFactory.generatePoints(coordinate);
    }

    private static void reEnterCoordinate(String message){
        ResultView.printReEnterMessage(message);
        goCoordinate();
    }
}
