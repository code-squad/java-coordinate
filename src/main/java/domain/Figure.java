package domain;

import view.InputView;

import java.util.*;

import static com.google.common.math.IntMath.pow;
import static java.lang.Math.sqrt;

public class Figure {

    private double area;

    private Points points;

    private Figure() {
        this.points = Points.of();
    }

    private Figure(Points points) {
        this.points = points;
    }

    public static Figure of() {
        return new Figure();
    }

    public static Figure of(Points points) {
        return new Figure(points);
    }

    public boolean hasCoordinateAt(int x, int y) {
        return points.contains(x, y);
    }

    public void calculate() {
        if (points.isLine()) area = calculateLine(this.points);
        if (points.isRectangle()) area = calculateRectangleArea(this.points);
    }

    public void initPoints() {
        List<String> coordinates;
        try {
            System.out.println("Input coordinates. ex. (1,2)-(3,4)-(5,1)");
            coordinates = Utils.checkReturnCoordinates(InputView.initCoordinate());
            coordinates = Utils.figureCheckReturn(coordinates);
            this.points = Points.setCoordinates(coordinates);
        } catch (RuntimeException e) {
            initPoints();
        }
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        if (points.isLine()) return "Line";
        return "Rectangle";
    }
}
