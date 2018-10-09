package coordinate.domain;

import java.util.Objects;

public class Coordinate implements Comparable<Coordinate> {
    private final int x;
    private final int y;

    private Coordinate(int x, int y) {
        if (x < 0 || x > 24) {
            throw new IllegalArgumentException();
        }
        this.x = x;
        if (y < 0 || y > 24) {
            throw new IllegalArgumentException();
        }
        this.y = y;
    }

    public static Coordinate of(int x, int y) {
        return new Coordinate(x, y);
    }

    public static Coordinate of(String x, String y) {
        return new Coordinate(Integer.parseInt(x), Integer.parseInt(y));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int subtractXCoordinateFrom(Coordinate endPoint) {
        return endPoint.minusX(x);
    }

    public int subtractYCoordinateFrom(Coordinate endPoint) {
        return endPoint.minusY(y);
    }

    private int minusX(int number) {
        return this.x - number;
    }

    private int minusY(int number) {
        return this.y - number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate point = (Coordinate) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int compareTo(Coordinate o) {
        return Integer.compare(x, o.x);
    }
}
