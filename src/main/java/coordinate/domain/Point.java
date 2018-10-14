package coordinate.domain;

import coordinate.utill.AxisCondition;

import java.util.Arrays;
import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    private Point(int x, int y) {
        if (x < AxisCondition.MIN_AXIS || x > AxisCondition.MAX_AXIS ||
                y < AxisCondition.MIN_AXIS || y > AxisCondition.MAX_AXIS) {
            throw new IllegalArgumentException("값의 범위를 벗어납니다. " +
                    "(최소 : " + AxisCondition.MIN_AXIS + ", 최대 : " + AxisCondition.MAX_AXIS + ")");
        }
        this.x = x;
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public static Point ofCommaSeparator(String text) {
        if (!text.contains(",")) {
            throw new IllegalArgumentException("문자열에 ',' 구분자가 없습니다.");
        }
        String[] values = text.split(",");
        return new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
    }

    public double distance(Point other) {
        return Math.sqrt(Math.pow(lengthX(other), 2) + Math.pow(lengthY(other), 2));
    }

    public int lengthX(Point other) {
        return Math.abs(other.x - this.x);
    }

    public int lengthY(Point other) {
        return Math.abs(other.y - this.y);
    }

    public boolean equalToAxisOfX(int otherX) {
        return x == otherX;
    }

    public boolean equalToAxisOfY(int otherY) {
        return y == otherY;
    }

    public boolean equalToAxisOfX(Point other) {
        return x == other.x;
    }

    public boolean equalToAxisOfY(Point other) {
        return y == other.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
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
