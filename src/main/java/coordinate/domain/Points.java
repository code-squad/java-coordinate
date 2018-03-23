package coordinate.domain;

import coordinate.view.Output;

import java.util.*;

import static coordinate.domain.Utils.X_INDEX;
import static coordinate.domain.Utils.Y_INDEX;

public class Points {

    public static List<Point> processCoordinates(String input) {
        List<Point> points = new ArrayList<>();
        String[] splitInput = Utils.checkInputFormat(input);
        for (String set : splitInput) {
            int[] xySet = Utils.convertToIntegerArray(set);
            points = addPoints(points, xySet);
        }
        return points;
    }

    private static List<Point> addPoints(List<Point> points, int[] xySet) throws IllegalArgumentException {
        Point newPoint = new Point(xySet[X_INDEX], xySet[Y_INDEX]);
        if (points.contains(newPoint)) {
            Output.printMessage("중복된 좌표가 있습니다."); //중복 체크
            throw new IllegalArgumentException();
        }
        points.add(newPoint);
        return points;
    }

    static List<Integer> getXOnRowY(List<Point> points, int y) {
        List<Integer> xOnRow = new ArrayList<>();
        for (Point point : points) {
            if (point.contains(y)) {
                xOnRow.add(point.getX());
            }
        }
        return xOnRow;
    }
}