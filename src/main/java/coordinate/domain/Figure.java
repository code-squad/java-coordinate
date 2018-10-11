package coordinate.domain;

import java.util.List;

public abstract class Figure {
    protected List<Point> points;

    public Figure(List<Point> points) {
        this.points = points;
    }

    protected abstract boolean isValid();

    public abstract double area();

    public abstract String getName();
}
