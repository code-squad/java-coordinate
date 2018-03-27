package domain;

import java.util.List;

import static domain.FigureUtil.isLine;

public class Line extends Figure {

    private double area;

    private Line(List<String> coordinates) {
        super(Points.initCoordinates(coordinates));
    }

    public static Line of(List<String> coordinates) {
        if (!isLine(coordinates)) {
            throw new RuntimeException();
        }
        return new Line(coordinates);
    }

    public double getArea() {
        return area;
    }

    public void calculate() {
        area = calculateLine(0, 1);
    }

    @Override
    public String toString() {
        return "Line";
    }

}
