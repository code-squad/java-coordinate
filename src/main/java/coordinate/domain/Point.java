package coordinate.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Point {
    private static final int DOMAIN_RANGE = 24;

    private final int x;
    private final int y;

    Point(int x, int y) {
        checkDomainRange(x, y);
        this.x = x;
        this.y = y;
    }

    static void checkDomainRange(int x, int y) throws IllegalArgumentException {
        if (isOutOfDomainRange(x) || isOutOfDomainRange(y)) {
            throw new IllegalArgumentException();
        }
    }

    public double calculateDistanceFrom(Point point) {
        double xSquared = Math.pow(point.subtractX(x), 2);
        double ySquared = Math.pow(point.subtractY(y), 2);
        return Math.sqrt(xSquared - ySquared);
    }

    private int subtractX(int x) {
        return this.x - x;
    }

    private double subtractY(int y) {
        return this.y - y;
    }

    private static boolean isOutOfDomainRange(Integer number) {
        return number > DOMAIN_RANGE;
    }

    public boolean xEquals(int x) {
        return this.x == x;
    }

    public boolean yEquals(int y) {
        return this.y == y;
    }

    public List<Point> getXDuplicates(List<Point> points) {
        return points.stream().filter(point -> point.xEquals(x)).collect(Collectors.toList());
    }

    public List<Point> getYDuplicates(List<Point> points) {
        return points.stream().filter(point -> point.yEquals(y)).collect(Collectors.toList());
    }

    @Override
    public boolean equals(Object o) {
        Point p = (Point) o;
        return p.xEquals(x) && p.yEquals(y);
    }
}