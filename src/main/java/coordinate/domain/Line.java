package coordinate.domain;

import java.util.List;

public class Line extends AbstractFigure {

    public Line(List<Point> points) {
        super(points);
        figureException();
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
        return points.get(0).calculateLIne(points.get(1));
    }

}
