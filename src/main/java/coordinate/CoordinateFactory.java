package coordinate;

import coordinate.controller.LineFactory;
import coordinate.controller.PointFactory;
import coordinate.controller.RectangleFactory;
import coordinate.domain.Point;
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
            ResultView.draw(points);
            goLine(points);
            goRectangle(points);
        }catch (IllegalArgumentException | IndexOutOfBoundsException e){
            reEnterCoordinate();
        }
    }

    private static void goRectangle(List<Point> points) {
        if(RectangleFactory.isRectangle(points.size())){
            ResultView.showRectangleArea(RectangleFactory.generateRectangle(points));
        }
    }

    private static void goLine(List<Point> points){
        if(LineFactory.isLine(points.size())){
            ResultView.showLineLength(LineFactory.generateLine(points));
        }
    }

    private static List<Point> inputCoordinate(){
        String[] coordinate = InputView.getCoordinate();
        return PointFactory.generatePoints(coordinate);
    }

    private static void reEnterCoordinate(){
        ResultView.printReEnterMessage();
        goCoordinate();
    }
}
