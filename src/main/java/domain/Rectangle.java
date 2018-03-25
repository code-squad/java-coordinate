package domain;

import java.util.List;

import static domain.FigureUtil.isRectangle;

public class Rectangle extends Figure {

    Rectangle(List<String> coordinates) {
        super.points = Points.initCoordinates(coordinates);
    }

    public void calculate() {
        super.area = super.points.calculateRectangle();
    }

    public static Figure createFigure(List<String> coordinates) {
        if (!isRectangle(coordinates)) {
            throw new RuntimeException();
        }
        return new Rectangle(coordinates);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

}
