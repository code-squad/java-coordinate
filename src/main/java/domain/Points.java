package domain;

import java.util.*;

import static domain.InputUtil.calculateLineBwPoints;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
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

    double calculateLineBwPoints(int a, int b) {
        return points.get(a).getLengthBwTwoPoints(points.get(b));
    }

    public boolean contains(int x, int y) {
        return points.contains(Point.of(x, y));
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
