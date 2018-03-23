package domain;

import java.util.List;

public class Line extends Figure {

    Line(List<String> coordinates) {
        super.points = Points.initCoordinates(coordinates);
    }

    @Override
    public void calculate() {
        super.area = super.points.calculateLine();
    }

    @Override
    public String toString() {
        return "Line";
    }

}
