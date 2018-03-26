package coordinate.domain;

import java.util.List;

public class Square extends Shape {
    private static final int POINTS_PER_SIDE = 2;
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

    static boolean twoPoints(List<Point> points, Point point) {
        return point.getPointsPerRow(points).size() != POINTS_PER_SIDE
                || point.getPointsPerColumn(points).size() != POINTS_PER_SIDE;
    }


    double calculateHeight() {
        List<Point> pointsOnSameColumn = points.get(FIRST).getPointsPerColumn(points);
        Point firstPoint = pointsOnSameColumn.get(FIRST);
        Point secondPoint = pointsOnSameColumn.get(SECOND);
        return firstPoint.calculateDistanceFrom(secondPoint);
    }

    double calculateBase() {
        List<Point> pointsOnSameRow = points.get(FIRST).getPointsPerRow(points);
        Point firstPoint = pointsOnSameRow.get(FIRST);
        Point secondPoint = pointsOnSameRow.get(SECOND);
        return firstPoint.calculateDistanceFrom(secondPoint);
    }

    public double calculate() {
        return calculateBase() * calculateHeight();
    }

    public boolean isMatch(int x, int y) {
        return points.stream().anyMatch(p -> p.xEquals(x) && p.yEquals(y));
    }
}