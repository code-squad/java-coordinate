package coordinate.domain;

import coordinate.view.Output;

import java.util.*;

public class Points {

    private List<Point> points;

    public Points(String[] coordinates) {
        this.points = initPoints(coordinates);
    }

    private List<Point> initPoints(String[] splitInput) {
        List<Point> points = new ArrayList<>();
        for (String set : splitInput) {
            int[] xySet = Utils.convertToIntegerArray(set);
            addPoints(points, xySet);
        }
        return points;
    }

    static List<Point> addPoints(List<Point> points, int[] xySet) throws IllegalArgumentException {
        Point newPoint = new Point(xySet[Utils.X_INDEX], xySet[Utils.Y_INDEX]);
        if (points.contains(newPoint)) {
            Output.printMessage("중복된 좌표가 있습니다."); //중복 체크
            throw new IllegalArgumentException();
        }
        points.add(newPoint);
        return points;
    }

    List<Integer> getXOnRowY(int y) {
        List<Integer> pointsOnRowY = new ArrayList<>();
        for (Point point : points) {
            if (point.contains(y)) {
                pointsOnRowY.add(point.getX());
            }
        }
        return pointsOnRowY;
    }

    public double calculateDistance() {
        return Utils.calculateDistance(points);
    }
}