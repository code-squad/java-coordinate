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
        double a = getPoints().get(0).distance(getPoints().get(1));
        double b = getPoints().get(1).distance(getPoints().get(2));
        double c = getPoints().get(2).distance(getPoints().get(0));
        double s = (a + b + c) / 2;

        return Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }
}
