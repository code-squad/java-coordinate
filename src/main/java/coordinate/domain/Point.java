package coordinate.domain;

import java.util.Objects;

public class Point implements Comparable<Point>  {
    private final PointNo x;
    private final PointNo y;

    private Point(PointNo x, PointNo y) {
        this.x = x;
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(new PointNo(x), new PointNo(y));
    }

    public static Point of(String x, String y) {
        return new Point(new PointNo(x), new PointNo(y));
    }

    public int getX() {
        return x.getNo();
    }

    public int getY() {
        return y.getNo();
    }

    public double getDistance(Point other) {
        return Math.sqrt(Math.pow(other.minusX(x), 2) +
                Math.pow(other.minusY(y), 2));
    }

    private int minusX(PointNo number) {
        return Math.abs(x.getNo() - number.getNo());
    }

    private int minusY(PointNo number) {
        return Math.abs(y.getNo() - number.getNo());
    }

    public boolean isSameXCoordinate(Point other) {
        return other.isSameX(x.getNo());
    }

    private boolean isSameX(int number) {
        return number == x.getNo();
    }

    public boolean isSameYCoordinate(Point other) {
        return other.isSameY(y.getNo());
    }

    private boolean isSameY(int number) {
        return number == y.getNo();
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
        return Integer.compare(x.getNo(), o.x.getNo());
    }
}
