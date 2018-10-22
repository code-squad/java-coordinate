package domain;

import java.util.List;

public class Line {
    private static final int FIRST_POINT = 0;
    private static final int SECOND_POINT = 1;
    private List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    public double calculateLength() {
        return points.get(FIRST_POINT).calculateLength(points.get(SECOND_POINT));
    }
//
//    public double getSquareLength(List<Point> points) {
//        return points.get(FIRST_POINT).calculateSquareLength(points.get(SECOND_POINT));
//    }
}