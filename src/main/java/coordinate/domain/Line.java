package coordinate.domain;

import java.util.List;

public class Line extends AbstractFigure {

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public String name() {
        return "직선";
    }

    @Override
    protected int size() {
        return 2;
    }

    @Override
    public double area() {
        return super.points.get(0).calculateLIne(super.points.get(1));
    }

}
