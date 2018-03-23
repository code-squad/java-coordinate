package domain;

import java.util.*;

import static domain.Utils.calculateLineBwPoints;
import static java.lang.Math.sqrt;

public class Points {

    private List<Point> points;

    private Points() {
    }

    private Points(List<Point> points) {
        this.points = points;
    }

    public static Points of() {
        return new Points();
    }

    public static Points of(List<Point> points) {
        return new Points(points);
    }

    public static Points initCoordinates(List<String> coordinates) {
        ArrayList<Point> points = new ArrayList<>();
        for (String coordinate : coordinates) {
            points.add(Point.of(coordinate));
        }
        return Points.of(points);
    }

    public boolean contains(int x, int y) {
        return points.contains(Point.of(x, y));
    }

    public double calculateLine() {
        return calculateLineBwPoints(points.get(0), points.get(1));
    }

    public double calculateTriangle() {
        double a = calculateLineBwPoints(points.get(0), points.get(1));
        double b = calculateLineBwPoints(points.get(0), points.get(2));
        double c = calculateLineBwPoints(points.get(1), points.get(2));
        double s = (a + b + c) / 2;
        return sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double calculateRectangle() {
        ArrayList<Double> eachLengths = new ArrayList<>();
        for (int i = 1; i < points.size(); i++) {
            eachLengths.add(calculateLineBwPoints(points.get(0), points.get(i)));
        }
        Collections.sort(eachLengths);
        return eachLengths.get(0) * eachLengths.get(1);
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
