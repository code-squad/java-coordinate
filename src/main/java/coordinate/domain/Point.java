package coordinate.domain;

import java.util.Objects;

public class Point implements Comparable<Point>  {
    private final int x;
    private final int y;

    private Point(int x, int y) {
        if (x < 0 || x > 24) {
            throw new IllegalArgumentException("0 ~ 24까지만 입력 가능합니다.");
        }
        this.x = x;
        if (y < 0 || y > 24) {
            throw new IllegalArgumentException("0 ~ 24까지만 입력 가능합니다.");
        }
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public static Point of(String x, String y) {
        return new Point(Integer.parseInt(x), Integer.parseInt(y));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance(Point other) {
        return Math.sqrt(Math.pow(other.minusX(x), 2) +
                Math.pow(other.minusY(y), 2));
    }

    private int minusX(int number) {
        return Math.abs(this.x - number);
    }

    private int minusY(int number) {
        return Math.abs(this.y - number);
    }

    public boolean isSameXCoordinate(Point other) {
        return other.isSameX(x);
    }

    private boolean isSameX(int number) {
        return number == x;
    }

    public boolean isSameYCoordinate(Point other) {
        return other.isSameY(y);
    }

    private boolean isSameY(int number) {
        return number == y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        return Integer.compare(x, o.x);
    }
}
