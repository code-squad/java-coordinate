package coordinate.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Figure {
    static final int FIRST = 0;
    static final int SECOND = 1;
    static final int THIRD = 2;
    final List<Point> points;

    Figure(List<Point> points) {
        this.points = points;
    }

    public abstract double calculate();

    public abstract boolean isMatch(int x, int y);

    double calculateLength(int first, int second) {
        Point firstPoint = points.get(first);
        Point secondPoint = points.get(second);
        return firstPoint.calculateDistanceFrom(secondPoint);
    }

    public static Figure ofFigure(List<Point> points) {
        if (Line.isLine(points)) {
            return Line.ofLine(points);
        }
        if (Square.isSquare(points)) {
            return Square.ofSquare(points);
        }
        if (Triangle.isTriangle(points)) {
            return Triangle.ofTriangle(points);
        }
        return null;
    }

    public boolean isDuplicate() {
        Set<Point> unique = new HashSet<>();
        for (Point point : points) {
            if (!unique.add(point)) return true;
        }
        return false;
    }
}