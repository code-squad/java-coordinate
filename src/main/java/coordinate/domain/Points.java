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
        checkSquare(points);
        return points;
    }

    static List<Point> addPoints(List<Point> points, int[] xySet) throws IllegalArgumentException {
        Point newPoint = new Point(xySet);
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

    private static void checkSquare(List<Point> points) throws IllegalArgumentException {
        if (!(checkYCoordinate(sortPointsByY(points)) && checkXCoordinate(sortPointsByX(points)))) {
            throw new IllegalArgumentException();
        }
    }

    private static boolean checkYCoordinate(List<Point> sortedByY) {
        return sortedByY.get(0).getY() == sortedByY.get(1).getY() && sortedByY.get(2).getY() == sortedByY.get(3).getY();
    }

    private static boolean checkXCoordinate(List<Point> sortedByX) {
        return sortedByX.get(0).getX() == sortedByX.get(1).getX() && sortedByX.get(2).getX() == sortedByX.get(3).getX();
    }

    static List<Point> sortPointsByY(List<Point> points) {
        points.sort(Comparator.comparing(Point::getY));
        return points;
    }

    static List<Point> sortPointsByX(List<Point> points) {
        points.sort(Comparator.comparing(Point::getX));
        return points;
    }

    public double calculateDistance() {
        return Utils.calculateDistance(points);
    }

    public int calculateArea() {
        return Utils.calculateArea(points);
    }
}