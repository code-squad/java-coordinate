package coordinate;

import coordinate.domain.Point;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.List;

public class CoordinateFactory {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;

    public static void main(String[] args) {
        goCoordinate();
    }

    private static void goCoordinate(){
        try{
            List<Point> points = inputCoordinate();
            ResultView.draw(points);
            goLine(points);
        }catch (IllegalArgumentException | IndexOutOfBoundsException e){
            reEnterCoordinate();
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
