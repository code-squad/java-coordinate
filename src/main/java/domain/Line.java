package domain;

import java.util.List;

public class Line extends FigureAbstract {

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double area() {
        Point[] p = getPoints().toArray(new Point[getPoints().size()]);
        return p[0].calculateLength(p[1]);
    }

}
