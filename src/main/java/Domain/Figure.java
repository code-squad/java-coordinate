package Domain;

import View.InputView;

import java.util.ArrayList;

import static com.google.common.math.IntMath.pow;
import static java.lang.Math.sqrt;

public class Figure {

    private double length;

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

    public void calculateLine() {
        length = calculate(this.points);
    }

    static double calculate(Points points) {
        double xPowers = pow(points.getX(0) - points.getX(1), 2);
        double yPowers = pow(points.getY(0) - points.getY(1), 2);
        double length = sqrt(xPowers + yPowers);
        return length;
    }

    public void initPoints() {
        ArrayList<String> coordinates;
        try {
            System.out.println("Input coordinates. ex. (1,2)-(3,4)-(5,1)");
            coordinates = Utils.checkReturnCoordinates(InputView.initCoordinate());
            this.points = Points.setCoordinates(coordinates);
        } catch (RuntimeException e) {
            initPoints();
        }
    }

    public double getLength() {
        return length;
    }
}
