package domain;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.sqrt;

public abstract class Figure {

    private Points points;

    Figure(Points points){
        this.points = points;
    }

    public abstract void calculate();

    public abstract double getArea();

    public boolean hasCoordinateAt(int x, int y) {
        return points.contains(x, y);
    }

    double calculateTriangle() {
        double a = points.calculateLineBwPoints(0, 1);
        double b = points.calculateLineBwPoints(0, 2);
        double c = points.calculateLineBwPoints(1, 2);
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double calculateRectangle() {
        final int RECTANGLE_CONST = 4;
        ArrayList<Double> eachLengths = new ArrayList<>();
        for (int i = 1; i < RECTANGLE_CONST; i++) {
            eachLengths.add(points.calculateLineBwPoints(0, i));
        }
        Collections.sort(eachLengths);
        return eachLengths.get(0) * eachLengths.get(1);
    }

    double calculateLine() {
        return points.calculateLineBwPoints(0, 1);
    }
}
