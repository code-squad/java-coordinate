package coordinate.domain;

import java.util.List;

public class Triangle extends Figure {
    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public String name() {
        return "삼각형";
    }

    @Override
    public double area() {
        double a = points.get(0).distance(points.get(1));
        double b = points.get(1).distance(points.get(2));
        double c = points.get(2).distance(points.get(0));
        double s = (a + b + c) / 2;

        return Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }
}
