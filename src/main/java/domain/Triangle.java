package domain;

import java.util.List;

import static domain.FigureUtil.isTriangle;

public class Triangle extends Figure {

    Triangle(List<String> coordinates) {
        super.points = Points.initCoordinates(coordinates);
    }

    public static Figure createFigure(List<String> coordinates) {
        if (!isTriangle(coordinates)) {
            throw new RuntimeException();
        }
        return new Triangle(coordinates);
    }

    @Override
    public void calculate() {
        super.area = super.points.calculateTriangle();
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
