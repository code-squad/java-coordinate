package coordinate.domain;

import coordinate.view.Output;

import java.util.List;

public class Square extends Figure {
    private static final int FIRST = 0;
    private static final int SECOND = 1;
    private static final int SQUARE = 4;
    private final List<Point> points;

    private Square(List<Point> points) {
        this.points = points;
    }

    public static Square ofSquare(List<Point> points) throws IllegalArgumentException {
        if (!isSquare(points)) {
            throw new IllegalArgumentException();
        }
        if (Utils.isDuplicate(points)) {
            Output.printMessage("중복되는 좌표가 있습니다. 네 점의 위치는 달라야 합니다.");
            throw new IllegalArgumentException();
        }
        return new Square(points);
    }

    public static boolean isSquare(List<Point> points) {
        if (points.size() != SQUARE) {
            return false;
        }
        for (Point point : points) {
            if (areTwoPointsPerRowOrColumn(points, point)) return false;
        }
        return true;
    }

    private static boolean areTwoPointsPerRowOrColumn(List<Point> points, Point point) {
        return point.arwTwoPointsPerRow(points) || point.areTwoPointsPerColumn(points);
    }


    double calculateHeight() {
        List<Point> twoPoints = points.get(FIRST).getPointsOnSameColumn(points);
        Point firstPoint = twoPoints.get(FIRST);
        Point secondPoint = twoPoints.get(SECOND);
        return firstPoint.calculateDistanceFrom(secondPoint);
    }

    double calculateBase() {
        List<Point> twoPoints = points.get(FIRST).getPointsOnSameRow(points);
        Point firstPoint = twoPoints.get(FIRST);
        Point secondPoint = twoPoints.get(SECOND);
        return firstPoint.calculateDistanceFrom(secondPoint);
    }

    public double calculate() {
        return calculateBase() * calculateHeight();
    }

    public boolean isMatch(int x, int y) {
        return points.stream().anyMatch(p -> p.xEquals(x) && p.yEquals(y));
    }
}