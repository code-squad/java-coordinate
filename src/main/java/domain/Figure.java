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

    static double calculateLine(Points points) {
        double xPowers = pow(points.getX(0) - points.getX(1), 2);
        double yPowers = pow(points.getY(0) - points.getY(1), 2);
        double length = sqrt(xPowers + yPowers);
        return length;
    }

    static int calculateRectangleArea(Points points) {
        List<Integer> xCoords = new ArrayList<>();
        List<Integer> yCoords = new ArrayList<>();
        final int RECTANGLE_CONSTANT = 4;
        for (int i = 0; i < RECTANGLE_CONSTANT; i++) {
            xCoords.add(points.getX(i));
            yCoords.add(points.getY(i));
        }
        Collections.sort(xCoords);
        Collections.sort(yCoords);
        int xLength = Math.abs(xCoords.get(0) - xCoords.get(xCoords.size() - 1));
        int yLength = Math.abs(yCoords.get(0) - yCoords.get(xCoords.size() - 1));
        int area = xLength * yLength;
        return area;
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
