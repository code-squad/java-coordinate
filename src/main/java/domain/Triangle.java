package domain;

import java.util.List;

public class Triangle extends Figure {

    Triangle(List<String> coordinates) {
        super.points = Points.initCoordinates(coordinates);
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
