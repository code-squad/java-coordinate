package coordinate.domain;

import java.util.List;

public class Square extends Shape {
    private static final int ANY_POINT = 3;
    private static final int FIRST_POINT = 0;
    private static final int SECOND_POINT = 1;
    private static final int POINTS_PER_SIDE = 2;
    private final List<Point> points;

    private Square(List<Point> points) {
        this.points = points;
    }

    public static Square ofSquare(List<Point> points) {
        return new Square(points);
    }

    public boolean isSquare() {
        List<Point> pointsOnSameRow = points.get(ANY_POINT).getPointsOnSameRow(points);
        List<Point> pointsOnSameColumn = points.get(ANY_POINT).getPointsOnSameColumn(points);
        return pointsOnSameRow.size() == POINTS_PER_SIDE && pointsOnSameColumn.size() == POINTS_PER_SIDE;
    }

    double calculateHeight() {
        List<Point> pointsOnSameColumn = points.get(ANY_POINT).getPointsOnSameColumn(points);
        Point firstPoint = pointsOnSameColumn.get(FIRST_POINT);
        Point secondPoint = pointsOnSameColumn.get(SECOND_POINT);
        return firstPoint.calculateDistanceFrom(secondPoint);
    }

    double calculateBase() {
        List<Point> pointsOnSameRow = points.get(ANY_POINT).getPointsOnSameRow(points);
        Point firstPoint = pointsOnSameRow.get(FIRST_POINT);
        Point secondPoint = pointsOnSameRow.get(SECOND_POINT);
        return firstPoint.calculateDistanceFrom(secondPoint);
    }

    public double calculate() {
        return calculateBase() * calculateHeight();
    }

    public boolean isMatch(int x, int y) {
        return points.stream().anyMatch(p -> p.xEquals(x) && p.yEquals(y));
    }
}