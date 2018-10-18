package coordinate;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) throws IllegalArgumentException {
        if (x < 0 || x > 24 || y < 0 || y > 24)
            throw new IllegalArgumentException("x와 y값은 0초과 24미만 값이어야 합니다.");
        this.x = x;
        this.y = y;
    }

    public double calculatorLength(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public Boolean matchX(Point point) {
        return this.x == point.x;
    }

    public Boolean matchY(Point point) {
        return this.y == point.y;
    }

    public Boolean matchDot(int x, int y) {
        return this.x * 3 == x && this.y == y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
