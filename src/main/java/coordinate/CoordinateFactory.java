package coordinate;

import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.util.StringHandler;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.ArrayList;
import java.util.List;

public class CoordinateFactory {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    public static void main(String[] args) {
        String[] coordinate = InputView.getCoordinate();
        List<Point> points = generatePoints(coordinate);
        ResultView.showCoordinate(points);
        if(isLine(points.size())){
            ResultView.showLineLength(generateLine(points));
        }
    }

    public static boolean isLine(int size){
        return size == TWO;
    }

    public static List<Point> generatePoints(String[] coordinate){
        List<Point> points = new ArrayList<>();
        for (String position : coordinate) {
            points.add(makePoint(position));
        }
        return points;
    }

    public static List<Integer> makeRefinedXY(String position){
        return StringHandler.parseIntegers(makeRawXY(position));
    }

    public static String[] makeRawXY(String position){
        return StringHandler.splitComma(StringHandler.cutBracket(position));
    }

    public static Point makePoint(String position){
        List<Integer> positionXY = makeRefinedXY(position);
        return new Point(positionXY.get(ZERO), positionXY.get(ONE));
    }

    public static Line generateLine(List<Point> points){
        return new Line(points.get(ZERO), points.get(ONE));
    }
}
