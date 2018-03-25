package domain;

import java.util.List;

public class Triangle extends Figure {

    Triangle(List<String> coordinates) {
        super.points = Points.initCoordinates(coordinates);
    }

    public static Figure createFigure(List<String> coordinates){
        if (!isTriangle(coordinates)){
            throw new RuntimeException();
        }
        return new Triangle(coordinates);
    }

    static boolean isTriangle(List<String> coordinates) {
        return coordinates.size() == 3;
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
