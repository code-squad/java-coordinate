package domain;

import java.util.Objects;

public class Point {

    private int x;
    private int y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point of(String coordinate) {
        String[] pair = coordinate.split(",");
        return new Point(Integer.parseInt(pair[0]), Integer.parseInt(pair[1]));
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
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
