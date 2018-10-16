package domain;

import java.util.List;

public class Line {
    static final int FIRST_POINT = 0;
    static final int SECOND_POINT = 1;

    public double getLength(List<Point> points) {
        return points.get(FIRST_POINT).calculateLength(points.get(SECOND_POINT));
    }

    public double getSquareLength(List<Point> points) {
        return points.get(FIRST_POINT).calculateSquareLength(points.get(SECOND_POINT));
    }
}