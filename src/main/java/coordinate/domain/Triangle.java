package coordinate.domain;

import java.util.List;

public class Triangle extends Shape {
    private static final int TRIANGLE = 3;
    private static final int FIRST = 0;
    private static final int SECOND = 1;
    private static final int THIRD = 2;
    private final List<Point> points;

    private Triangle(List<Point> points) {
        this.points = points;
    }

    public static Triangle ofTrianle(List<Point> points) throws IllegalArgumentException {
        if (!isTriangle(points)) {
            throw new IllegalArgumentException();
        }
        return new Triangle(points);
    }

    public static boolean isTriangle(List<Point> points) {
        return points.size() == TRIANGLE;
    }

    public double calculate() {
        double a = points.get(FIRST).calculateDistanceFrom(points.get(SECOND));
        double b = points.get(FIRST).calculateDistanceFrom(points.get(THIRD));
        double c = points.get(SECOND).calculateDistanceFrom(points.get(THIRD));

        double p = calculateParameter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double calculateParameter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean isMatch(int x, int y) {
        return points.stream().anyMatch(point -> point.xEquals(x) && point.yEquals(y));
    }
}