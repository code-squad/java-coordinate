package coordinate.domain;

import java.util.List;

public class Square extends Shape {
    private static final int ANY_POINT = 0;
    private static final int FIRST_DUPLICATE = 0;
    private static final int SECOND_DUPLICATE = 0;
    private final List<Point> points;

    private Square(List<Point> points) {
        this.points = points;
    }

    public static Square ofSquare(List<Point> points) {
        return new Square(points);
    }

    public boolean isSquare() {
        return getXDuplicates(points) == getYDuplicates(points);
    }

    private static List<Point> getYDuplicates(List<Point> points) {
        return points.get(ANY_POINT).getYDuplicates(points);
    }

    private static List<Point> getXDuplicates(List<Point> points) {
        return points.get(ANY_POINT).getXDuplicates(points);
    }

    double calculateHeight() {
        List<Point> yDuplicates = getYDuplicates(points);
        return yDuplicates.get(FIRST_DUPLICATE).calculateDistanceFrom(yDuplicates.get(SECOND_DUPLICATE));
    }

    double calculateBase() {
        List<Point> xDuplicates = getXDuplicates(points);
        return xDuplicates.get(FIRST_DUPLICATE).calculateDistanceFrom(xDuplicates.get(SECOND_DUPLICATE));
    }

    public double calculate() {
        return calculateBase() * calculateHeight();
    }
}