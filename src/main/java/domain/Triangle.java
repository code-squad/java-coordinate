package domain;

import java.util.List;

public class Triangle extends FigureAbstract {

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public double area() {
        Point[] p = getPoints().toArray(new Point[getPoints().size()]);
        double a = p[0].calculateLength(p[1]);
        double b = p[1].calculateLength(p[2]);
        double c = p[2].calculateLength(p[0]);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
