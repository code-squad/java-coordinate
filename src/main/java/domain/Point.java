package domain;

import java.util.Objects;

import static java.lang.Math.pow;
import static java.lang.StrictMath.abs;

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

    public double getLengthBwTwoPoints(Point otherPoint){
        return abs(pow(getXDiff(otherPoint), 2) + pow(getYDiff(otherPoint), 2));
    }

    int getXDiff(Point otherPoint){
        return this.x.getWidth(otherPoint.x);
    }

    int getYDiff(Point otherPoint){
        return this.y.getHeight(otherPoint.y);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point point = (Point) obj;
            if (this.x == point.x && this.y == point.y) return true;
        }
        return false;
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
