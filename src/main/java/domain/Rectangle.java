package domain;

import java.util.List;

public class Rectangle extends Figure {

    Rectangle(List<String> coordinates) {
        super.points = Points.setCoordinates(coordinates);
    }

    public void calculate() {
        super.area = super.points.calculateArea();
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

}
