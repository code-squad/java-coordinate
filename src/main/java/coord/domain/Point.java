package coord.domain;

import coord.util.Setting;

import java.util.Objects;

public class Point {
    public final int x;
    public final int y;

    private Point(int x, int y) {
        if (x > Setting.MAXIMUM || x < Setting.MINIMUM ||
                y > Setting.MAXIMUM || y < Setting.MINIMUM) {
            throw new IllegalArgumentException("잘못된 값 범위");
        }
        this.x = x;
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public static Point ofText(String text) {
        String[] parsed = text.split(",");
        if (parsed.length != 2) {
            throw new IllegalArgumentException("잘못된 입력");
        }
        return new Point(Integer.parseInt(parsed[0]), Integer.parseInt(parsed[1]));
    }

    public double distanceTo(Point point) {
        return Math.sqrt(square(x - point.x) + square(y - point.y));
    }

    private double square(int value) {
        return Math.pow(value, 2);
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
}
