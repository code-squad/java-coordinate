package coordinate.domain;

public class Point {
    private static final int DOMAIN_RANGE = 24;

    private final int x;
    private final int y;

    Point(int x, int y) {
        checkDomainRange(x, y);

        this.x = x;
        this.y = y;
    }

    void checkDomainRange(int x, int y) throws IllegalArgumentException {
        if (isOutOfDomainRange(x) || isOutOfDomainRange(y)) {
            throw new IllegalArgumentException();
        }
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

    private static boolean isOutOfDomainRange(Integer number) {
        return number > DOMAIN_RANGE;
    }

    @Override
    public boolean equals(Object o) {
        Point point = (Point) o;
        return point.x == this.x && point.y == this.y;
    }
}