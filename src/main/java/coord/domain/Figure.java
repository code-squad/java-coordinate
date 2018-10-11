package coord.domain;

import java.util.List;

abstract public class Figure {
    protected List<Point> points;

    Figure(List<Point> points) {
        this.points = points;
    }

    abstract public double size();

    abstract public Figure addPoint(Point point);

    abstract public String figureKind();
}
