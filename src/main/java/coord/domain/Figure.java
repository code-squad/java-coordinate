package coord.domain;

import java.util.List;

abstract public class Figure {
    List<Point> points;

    abstract public double size();

    abstract public Figure addPoint(Point point);

    abstract public String figureKind();
}
