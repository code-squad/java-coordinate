package coordinate;

import coordinate.domain.Point;
import coordinate.util.StringHandler;

import java.util.ArrayList;
import java.util.List;

public class PointFactory {

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
        return new Point(positionXY.get(CoordinateFactory.ZERO), positionXY.get(CoordinateFactory.ONE));
    }
}
