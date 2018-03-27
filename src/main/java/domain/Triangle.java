package domain;

import java.util.List;
import java.util.Objects;

import static domain.FigureUtil.isTriangle;
import static java.lang.Math.sqrt;

public class Triangle extends Figure {

    private Points points;

    private double area;

    private Triangle(List<String> coordinates) {
        super(Points.initCoordinates(coordinates));
    }

    public static Triangle of(List<String> coordinates) {
        if (!isTriangle(coordinates)) {
            throw new RuntimeException();
        }
        return new Triangle(coordinates);
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
