package coordinate.domain;

import java.util.ArrayList;

public class Line extends AbstractFigure {

    public Line(ArrayList<Point> points) {
        super(points);
    }

    @Override
    protected String name() {
        return "직선";
    }

    @Override
    protected int size() {
        return 2;
    }

    @Override
    public double area() {
        return points.get(0).calculateLIne(points.get(1));
    }

}
