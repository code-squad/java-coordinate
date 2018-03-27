package domain;

import java.util.List;

import static domain.FigureUtil.isRectangle;

public class Rectangle extends Figure {

    private double area;

    private Rectangle(List<String> coordinates) {
        super(Points.initCoordinates(coordinates));
    }

    public static Rectangle of(List<String> coordinates) {
        if (!isRectangle(coordinates)) {
            throw new RuntimeException();
        }
        return new Rectangle(coordinates);
    }


    public double getArea(){
        return area;
    }

    public void calculate() {
        area = calculateRectangle();
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

}
