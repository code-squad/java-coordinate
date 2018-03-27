package domain;

import java.util.Objects;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private Positive x;
    private Positive y;

    private Point(int x, int y) {
        this.x = new Positive(x);
        this.y = new Positive(y);
    }

    public static Point of(String coordinate) {
        String[] pair = coordinate.split(",");
        return new Point(Integer.parseInt(pair[0]), Integer.parseInt(pair[1]));
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public double getLengthBwTwoPoints(Point otherPoint) {
        return sqrt(pow((double) getXDiff(otherPoint), 2) + pow((double) getYDiff(otherPoint), 2));
    }

    int getXDiff(Point otherPoint) {
        return this.x.getDiff(otherPoint.x);
    }

    int getYDiff(Point otherPoint) {
        return this.y.getDiff(otherPoint.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) &&
                Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return ".  ";
    }

}
