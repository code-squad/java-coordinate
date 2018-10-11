package coord.domain;

import coord.util.Setting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Point extends Figure {
    public final int x;
    public final int y;

    public Point(List<Point> points) {
        super(points);
        Point p = points.get(0);
        this.x = p.x;
        this.y = p.y;
        validCheck();
    }

    public Point(int x, int y) {
        super(new ArrayList<>());
        this.x = x;
        this.y = y;
        getPoints().add(this);
        validCheck();
    }

    private void validCheck() {
        if (x > Setting.MAXIMUM || x < Setting.MINIMUM ||
                y > Setting.MAXIMUM || y < Setting.MINIMUM) {
            throw new IllegalArgumentException("잘못된 값 범위");
        }
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

    double distanceTo(Point point) {
        return Math.sqrt(square(x - point.x) + square(y - point.y));
    }

    private double square(int value) {
        return Math.pow(value, 2);
    }

    Point grepVertical(List<Point> points) {
        for (Point point : points) {
            if (this.x == point.x && this.y != point.y) {
                return point;
            }
        }
        throw new IllegalArgumentException();
    }

    Point grepHorizontal(List<Point> points) {
        for (Point point : points) {
            if (this.y == point.y && this.x != point.x) {
                return point;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String figureKind() {
        return "점";
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
