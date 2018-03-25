package coordinate.domain;

import java.util.List;

public class Square extends Shape {
    private static final int ANY_POINT = 3;
    private static final int FIRST_POINT = 0;
    private static final int SECOND_POINT = 1;
    private final List<Point> points;

    private Square(List<Point> points) {
        this.points = points;
    }

    public static Square ofSquare(List<Point> points) {
        return new Square(points);
    }

    public boolean isSquare() {
        return getPointsOnSameX(points).size() == getPointsOnSameY(points).size();
    }

    private static List<Point> getPointsOnSameY(List<Point> points) {
        return points.get(ANY_POINT).getPointsOnSameY(points.subList(0, ANY_POINT));
    }

    private static List<Point> getPointsOnSameX(List<Point> points) {
        return points.get(ANY_POINT).getPointsOnSameX(points.subList(0, ANY_POINT));
    }

    double calculateHeight() {
        Point firstPoint = getPointsOnSameY(points).get(FIRST_POINT);
        Point secondPoint = getPointsOnSameY(points).get(SECOND_POINT);
        return firstPoint.calculateDistanceFrom(secondPoint);
    }

    double calculateBase() {
        Point firstPoint = getPointsOnSameX(points).get(FIRST_POINT);
        Point secondPoint = getPointsOnSameX(points).get(SECOND_POINT);
        return firstPoint.calculateDistanceFrom(secondPoint);
    }

    public double calculate() {
        return calculateBase() * calculateHeight();
    }

    public boolean isMatch(int x, int y) {
        return points.stream().anyMatch(p -> p.xEquals(x) && p.yEquals(y));
    }
}