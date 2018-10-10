package domain;

import java.util.List;

public class Dot extends Figure {

    protected Dot(List<Point> points) throws IllegalArgumentException {
        super(points);
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String printArea() {
        return "점 입니다.";
    }
}
