package domain;

import java.util.List;

public class Line {
    private static final int FIRST_POINT = 0;
    private static final int SECOND_POINT = 1;
    private List<Point> points;

    public Line(List<Point> points) {
        checkSize(points);
        this.points = points;
    }

    private void checkSize(List<Point> points) {
        if (points.size() != 2) {
            throw new IllegalArgumentException();
        }
    }

    public double calculateLength() {
        return points.get(FIRST_POINT).calculateLength(points.get(SECOND_POINT));
    }
}