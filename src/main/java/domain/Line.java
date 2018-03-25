package domain;

import java.util.List;

import static domain.FigureUtil.isLine;

public class Line extends Figure {

    final int LINE_CONST;

    private Line(List<String> coordinates) {
        if (!isLine(coordinates)) {
            throw new RuntimeException();
        }
        super.points = Points.initCoordinates(coordinates);
        this.LINE_CONST = coordinates.size();
    }

    public static Line of(List<String> coordinates) {
        return new Line(coordinates);
    }

    double calculateLine() {
        return points.calculateLineBwPoints(0, 1);
    }

    @Override
    public void calculate() {
        super.area = calculateLine();
    }

    @Override
    public String toString() {
        return "Line";
    }

}
