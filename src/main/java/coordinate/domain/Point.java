package coordinate.domain;

public class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean contains(int y) {
        return this.y == y;
    }

    @Override
    public boolean equals(Object o) {
        Point point = (Point) o;
        return point.x == this.x && point.y == this.y;
    }
}