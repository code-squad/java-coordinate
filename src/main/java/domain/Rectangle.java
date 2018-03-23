package domain;

import java.util.List;

public class Rectangle extends Figure {

    Rectangle(List<String> coordinates) {
        super.points = Points.setCoordinates(coordinates);
    }

    public void calculate() {
        super.area = super.points.calculateRectangle();
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

}
