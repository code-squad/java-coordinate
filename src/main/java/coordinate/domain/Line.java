package coordinate.domain;

import java.util.List;

public class Line extends Shape {
    private static final int FIRST_POINT = 0;
    private static final int SECOND_POINT = 1;
    private static final int NUMBER_OF_POINTS = 2;
    private final List<Point> points;

    private Line(List<Point> points) {
        this.points = points;
    }

    public static Line ofLine(List<Point> points) {
        return new Line(points);
    }

    public double calculate() {
        return points.get(FIRST_POINT).calculateDistanceFrom(points.get(SECOND_POINT));
    }

    public boolean isLine() {
        return points.size() == NUMBER_OF_POINTS;
    }
}