package coordinate.controller;

import coordinate.domain.Point;
import coordinate.util.StringHandler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PointFactory {
    public static final int ZERO = 0;
    public static final int ONE = 1;

    public static List<Point> generatePoints(String[] coordinate){
        List<Point> points = new ArrayList<>();
        for (String position : coordinate) {
            points.add(makePoint(position));
        }
        if(isDuplication(points)){
            throw new IllegalArgumentException("DuplicationException");
        }
        return points;
    }

    private static List<Integer> makeRefinedXY(String position){
        return StringHandler.parseIntegers(makeRawXY(position));
    }

    private static String[] makeRawXY(String position){
        return StringHandler.splitComma(StringHandler.cutBracket(position));
    }

    private static Point makePoint(String position){
        List<Integer> positionXY = makeRefinedXY(position);
        return new Point(positionXY.get(ZERO), positionXY.get(ONE));
    }

    private static boolean isDuplication(List<Point> points){
        Set copyPoints = new HashSet();
        for (Point point : points) {
            copyPoints.add(point);
        }
        if(copyPoints.size() != points.size()) return true;
        return false;
    }
}
