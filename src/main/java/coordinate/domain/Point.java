package coordinate.domain;

import java.util.Objects;

public class Point {
    public static final int MAX_SIZE = 24;
    private static final int MIN_SIZE = 0;
    public static final int TWO = 2;

    private int x;
    private int y;

    private Point(int x, int y) {
        this.x = sizeCheck(x);
        this.y = sizeCheck(y);
    }

    public static Point ofXY(int x, int y) {
        return new Point(x, y);
    }

    int sizeCheck(int num) throws IllegalArgumentException {
        if (num > MAX_SIZE || num < MIN_SIZE) throw new IllegalArgumentException("범위에 맞게 입력해주세요.");
        return num;
    }

    public double getDistance(Point other) {
        return Math.sqrt(Math.pow((this.x - other.x), TWO) + Math.pow((this.y - other.y), TWO));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
}


