package domain;

import java.util.List;

public class Dot extends Figure {

    protected Dot() {
        super();
    }

    @Override
    public Figure init(List<Point> points) {
        this.points = points;
        return this;
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
