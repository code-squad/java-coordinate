package coordinate;

import coordinate.domain.Point;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.List;

public class CoordinateFactory {
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int MAX_POSITION = 24;

    public static void main(String[] args) {
        List<Point> points = inputCoordinate();
        ResultView.draw(points);
        if(LineFactory.isLine(points.size())){
            ResultView.showLineLength(LineFactory.generateLine(points));
        }
    }

    public static List<Point> inputCoordinate(){
        String[] coordinate = InputView.getCoordinate();
        if(!BoundaryChecker.isValid(coordinate)){
            ResultView.printReEnterMessage();
            inputCoordinate();
        }
        return PointFactory.generatePoints(coordinate);
    }
}
