package domain;

import java.util.List;

public class Line extends Figure{
    private static final int FIRST_POINT = 0;
    private static final int SECOND_POINT = 1;
    private static final int TWO = 2;

    public Line(List<Point> points) {
        super(points);
        checkSize(TWO);
    }

    public double area() {
        return getPoint(FIRST_POINT).calculateLength(getPoint(SECOND_POINT));
    }
}