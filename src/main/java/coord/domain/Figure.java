package coord.domain;

import java.util.List;

abstract public class Figure implements Area{
    protected List<Point> points;

    Figure(List<Point> points) {
        this.points = points;
    }

    abstract public double area();

    abstract public Figure addPoint(Point point);

    abstract public String figureKind();
}
