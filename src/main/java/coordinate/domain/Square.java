package coordinate.domain;

import java.util.List;

public class Square extends Shape {
    private static final int FIRST = 0;
    private static final int SECOND = 1;
    private final List<Point> points;

    private Square(List<Point> points) {
        this.points = points;
    }

    public static Square ofSquare(List<Point> points) throws IllegalArgumentException {
        if (!isSquare(points)) {
            throw new IllegalArgumentException();
        }
        return new Square(points);
    }

    public static boolean isSquare(List<Point> points) {
        for (Point point : points) {
            if (twoPoints(points, point)) return false;
        }
        return true;
    }

    private static boolean twoPoints(List<Point> points, Point point) {
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