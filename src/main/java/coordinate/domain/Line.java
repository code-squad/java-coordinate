package coordinate.domain;

import java.util.List;

public class Line extends Shape {
    private static final int FIRST = 0;
    private static final int SECOND = 1;
    private static final int SIZE = 2;
    private final Point a;
    private final Point b;

    private Line(List<Point> points) {
        this.a = points.get(FIRST);
        this.b = points.get(SECOND);
    }

    public static Line ofLine(List<Point> points) throws IllegalArgumentException {
        if (!areTwoPoints(points)) {
            throw new IllegalArgumentException();
        }
        return new Line(points);
    }

    private static boolean areTwoPoints(List<Point> points) {
        return points.size() == SIZE;
    }

    public double calculate() {
        return a.calculateDistanceFrom(b);
    }

    public boolean isMatch(int x, int y) {
        return a.xEquals(x) && a.yEquals(y) || b.xEquals(x) && b.yEquals(y);
    }
}