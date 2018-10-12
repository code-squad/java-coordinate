package coord.domain;

import coord.util.Setting;

import java.util.Objects;
import java.util.stream.Stream;

public class Point {
    public final int x;
    public final int y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
        validCheck();
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public static Point ofText(String replaced) {
        String[] split = replaced.split(",");
        if (split.length != 2) {
            throw new IllegalArgumentException();
        }
        return of(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
    }

    private void validCheck() {
        if (x > Setting.MAXIMUM || x < Setting.MINIMUM ||
                y > Setting.MAXIMUM || y < Setting.MINIMUM) {
            throw new IllegalArgumentException("잘못된 값 범위");
        }
    }

    double distanceTo(Point point) {
        return Math.sqrt(square(x - point.x) + square(y - point.y));
    }

    private double square(int value) {
        return Math.pow(value, 2);
    }

    Point grepVertical(Stream<Point> stream) {
        return stream
                .filter(point -> x == point.x && y != point.y)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    Point grepHorizontal(Stream<Point> stream) {
        return stream
                .filter(point -> x != point.x && y == point.y)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
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
