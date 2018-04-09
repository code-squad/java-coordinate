package coordinate.domain;

import java.util.List;

public class Triangle extends Figure {

    public Triangle(List<String> points) {
        super(points);
    }

    private double a = super.getPoint(0).length(super.getPoint(1));

    private double b = super.getPoint(1).length(super.getPoint(2));

    private double c = super.getPoint(0).length(super.getPoint(2));

    public double area() {
        double s = (a + b + c) / 2;
        double result = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);
        return Math.round((result * 100d) / 100d);
    }

}
