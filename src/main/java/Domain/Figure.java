package Domain;

import View.InputView;

import java.util.ArrayList;

import static com.google.common.math.IntMath.pow;
import static java.lang.Math.sqrt;

public class Figure {

    private double area;

    private ArrayList<Point> points = new ArrayList<>();

    static ArrayList<Point> setCoordinates(ArrayList<String> coordinates) {
        ArrayList<Point> points = new ArrayList<>();
        for (String coordinate : coordinates) {
            String[] pair = coordinate.split(",");
            points.add(Point.of(Integer.parseInt(pair[0]), Integer.parseInt(pair[1])));
        }
        return points;
    }

    public boolean isAtCoordinate(int x, int y) {
        return this.points.contains(Point.of(x, y));
    }

    public void calculateLine(){
        this.area = calculate(this.points);
    }

    static double calculate(ArrayList<Point> points) {
        double xPowers = pow(points.get(0).getX() - points.get(1).getX(), 2);
        double yPowers = pow(points.get(0).getY() - points.get(1).getY(), 2);
        double length = sqrt(xPowers + yPowers);
        return length;
    }

    public void initPoints() {
        ArrayList<String> coordinates;
        try {
            System.out.println("Input coordinates. ex. (1,2)-(3,4)-(5,1)");
            coordinates = Utils.checkReturnCoordinates(InputView.initCoordinate());
            this.points = setCoordinates(coordinates);
        } catch (RuntimeException e) {
            initPoints();
        }
    }

    public double getArea() {
        return area;
    }
}
