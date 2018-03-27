package domain;

import java.util.ArrayList;
import java.util.Collections;
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
        final int RECTANGLE_CONST = 4;
        ArrayList<Double> eachLengths = new ArrayList<>();
        for (int i = 1; i < RECTANGLE_CONST; i++) {
            eachLengths.add(calculateLine(0, i));
        }
        Collections.sort(eachLengths);
        area = eachLengths.get(0) * eachLengths.get(1);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

}
