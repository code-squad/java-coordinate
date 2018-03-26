package domain;

import java.util.List;

import static domain.FigureUtil.isTriangle;
import static java.lang.Math.sqrt;

public class Triangle extends Figure {

    final int TRIANGLE_CONST;

    private Triangle(List<String> coordinates) {
        if (!isTriangle(coordinates)) {
            throw new RuntimeException();
        }
        super.points = Points.initCoordinates(coordinates);
        this.TRIANGLE_CONST = coordinates.size();
    }

    public static Triangle of(List<String> coordinates) {
        return new Triangle(coordinates);
    }

    double calculateTriangle() {
        double a = points.calculateLineBwPoints(0, 1);
        double b = points.calculateLineBwPoints(0, 2);
        double c = points.calculateLineBwPoints(1, 2);
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public void calculate() {
        super.area = calculateTriangle();
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
