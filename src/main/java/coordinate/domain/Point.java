package coordinate.domain;

import java.util.*;

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

    private static boolean isOutOfDomainRange(Integer number) {
        return number > DOMAIN_RANGE;
    }

    double calculateDistanceFrom(Point point) {
        double xSquared = Math.pow(point.subtractX(x), 2);
        double ySquared = Math.pow(point.subtractY(y), 2);
        return Math.sqrt(xSquared + ySquared);
    }

    private int subtractX(int x) {
        return this.x - x;
    }

    private int subtractY(int y) {
        return this.y - y;
    }

    List<Point> getPointsPerRow(List<Point> points) {
        List<Point> pointsOnSameRow = new ArrayList<>();
        for (Point point : points) {
            if (point.yEquals(y)) {
                pointsOnSameRow.add(point);
            }
        }
        return pointsOnSameRow;
    }

    List<Point> getPointsPerColumn(List<Point> points) {
        List<Point> pointsOnSameColumn = new ArrayList<>();
        for (Point point : points) {
            if (point.xEquals(x)) {
                pointsOnSameColumn.add(point);
            }
        }
        return pointsOnSameColumn;
    }

    boolean xEquals(int x) {
        return this.x == x;
    }

    boolean yEquals(int y) {
        return this.y == y;
    }

    @Override
    public boolean equals(Object o) {
        Point p = (Point) o;
        boolean c = p.xEquals(x) && p.yEquals(y);
        return c;
    }

    @Override
    public int hashCode() {
        return (31 * x) + (17 * y);
    }
}