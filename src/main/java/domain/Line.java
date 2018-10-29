package domain;

import java.util.List;

import static domain.FigureType.LINE;

public class Line extends Figure {
    private static final int FIRST_POINT = 0;
    private static final int SECOND_POINT = 1;

    Line(List<Point> points) {
        super(points);
    }

    @Override
    public String name() {
        return "라인의 길이는 ";
    }

    @Override
    public int size(){
        return LINE.getSize();
    }

    @Override
    public String area() {
        return String.format("%.6f", getPoint(FIRST_POINT).calculateLength(getPoint(SECOND_POINT)));
    }
}