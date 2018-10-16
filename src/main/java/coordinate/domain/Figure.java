package coordinate.domain;

import java.util.List;

public abstract class Figure {
    List<Point> points = null;

    public Figure(List<Point> points) {
        this.points = points;
    }

    abstract double getArea();
    abstract String getName();
    abstract int size();

    public Point getPoint(int index) {
        return points.get(index);
    }
}
