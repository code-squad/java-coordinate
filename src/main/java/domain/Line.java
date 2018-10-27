package domain;

import java.util.List;

public class Line extends Figure {
    private static final int FIRST_POINT = 0;
    private static final int SECOND_POINT = 1;
    private static final int TWO = 2;

    public Line(List<Point> points) {
        super(points);
        checkSize(TWO);
    }

    @Override
    public String name() {
        return "라인의 길이는 ";
    }

    @Override
    public String area() {
        return String.format("%.6f", getPoint(FIRST_POINT).calculateLength(getPoint(SECOND_POINT)));
    }
}