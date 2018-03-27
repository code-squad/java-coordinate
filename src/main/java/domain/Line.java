package domain;

import java.util.List;

import static domain.FigureUtil.isLine;

public class Line extends Figure {

    private Points points;

    private double area;

    private Line(List<String> coordinates) {
        if (!isLine(coordinates)) {
            throw new RuntimeException();
        }
        points = Points.initCoordinates(coordinates);
    }

    public static Line of(List<String> coordinates) {
        return new Line(coordinates);
    }

    double calculateLine() {
        return points.calculateLineBwPoints(0, 1);
    }

    public boolean hasCoordinateAt(int x, int y) {
        return points.contains(x, y);
    }

    public double getArea(){
        return area;
    }

    public void calculate() {
        area = calculateLine();
    }

    @Override
    public String toString() {
        return "Line";
    }

}
