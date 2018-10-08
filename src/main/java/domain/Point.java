package domain;

import java.util.Objects;

public class Point {

    public static final int MAXSIZE = 24;
    public static final int MINSIZE = 0;

    private int x;
    private int y;

    private Point(int x, int y) throws IllegalArgumentException {
        this.x = numSizeCheck(x);
        this.y = numSizeCheck(y);
    }

    public static int numSizeCheck(int num) {
        if (num < MINSIZE || num > MAXSIZE) {
            throw new IllegalArgumentException(String.valueOf(num));
        }
        return num;
    }

    public static Point init(int x, int y) throws IllegalArgumentException {
        return new Point(x, y);
    }

    public double getDistance(Point other) {
        return Math.sqrt(
                Math.pow((this.x - other.x), 2) + Math.pow((this.y - other.y), 2)
        );
    }

    public Boolean isSameX(Point point) {
        return this.x == point.x;
    }

    public Boolean isSameY(Point point) {
        return this.y == point.y;
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
