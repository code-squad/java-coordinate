package domain;

import java.util.List;
import java.util.Objects;

import static domain.FigureUtil.isTriangle;
import static java.lang.Math.sqrt;

public class Triangle extends Figure {

    private Points points;

    private double area;

    private Triangle(List<String> coordinates) {
        if (!isTriangle(coordinates)) {
            throw new RuntimeException();
        }
        points = Points.initCoordinates(coordinates);
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

    public boolean hasCoordinateAt(int x, int y) {
        return points.contains(x, y);
    }

    public double getArea(){
        return area;
    }

    public void calculate() {
        area = calculateTriangle();
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
