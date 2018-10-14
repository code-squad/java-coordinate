package coordinate.domain;

import java.util.List;

abstract class Figure {
    protected List<Point> points;

    public Figure(List<Point> points) {
        this.points = points;
    }

    abstract String name();

    abstract double area();
}

