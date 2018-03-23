package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static com.google.common.math.IntMath.pow;
import static java.lang.Math.sqrt;

public class Points {

    private List<Point> points;

    private Points() { }

    private Points(List<Point> points) {
        this.points = points;
    }

    public static Points of() {
        return new Points();
    }

    public static Points of(List<Point> points) {
        return new Points(points);
    }

    public static Points setCoordinates(List<String> coordinates) {
        ArrayList<Point> points = new ArrayList<>();
        for (String coordinate : coordinates) {
            String[] pair = coordinate.split(",");
            points.add(Point.of(Integer.parseInt(pair[0]), Integer.parseInt(pair[1])));
        }
        return Points.of(points);
    }

    public boolean contains(int x, int y) {
        return points.contains(Point.of(x, y));
    }

    public boolean isRectangle() { return points.size() == 4; }

    public boolean isLine() { return points.size() == 2; }

    public double calculateLine() {
        double xPowers = pow(points.get(0).getX() - points.get(1).getX(), 2);
        double yPowers = pow(points.get(0).getY() - points.get(1).getY(), 2);
        double length = sqrt(xPowers + yPowers);
        return length;
    }

    public int calculateArea() {
        List<Integer> xCoords = new ArrayList<>();
        List<Integer> yCoords = new ArrayList<>();
        final int RECTANGLE_CONSTANT = 4;
        for (int i = 0; i < RECTANGLE_CONSTANT; i++) {
            xCoords.add(points.get(i).getX());
            yCoords.add(points.get(i).getY());
        }
        Collections.sort(xCoords);
        Collections.sort(yCoords);
        int xLength = Math.abs(xCoords.get(0) - xCoords.get(xCoords.size() - 1));
        int yLength = Math.abs(yCoords.get(0) - yCoords.get(xCoords.size() - 1));
        int area = xLength * yLength;
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Points points1 = (Points) o;
        return Objects.equals(points, points1.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

}
