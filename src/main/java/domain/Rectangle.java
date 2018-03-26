package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static domain.FigureUtil.isRectangle;

public class Rectangle extends Figure {

    final int RECTANGLE_CONST = 4;

    private Rectangle(List<String> coordinates) {
        if (!isRectangle(coordinates)) {
            throw new RuntimeException();
        }
        super.points = Points.initCoordinates(coordinates);
    }

    public static Rectangle of(List<String> coordinates) {
        return new Rectangle(coordinates);
    }

    double calculateRectangle() {
        ArrayList<Double> eachLengths = new ArrayList<>();
        for (int i = 1; i < RECTANGLE_CONST; i++) {
            eachLengths.add(points.calculateLineBwPoints(0, i));
        }
        Collections.sort(eachLengths);
        return eachLengths.get(0) * eachLengths.get(1);
    }

    @Override
    public void calculate() {
        super.area = calculateRectangle();
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

}
