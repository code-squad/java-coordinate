package coordinate.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Figure implements Calculable {
    final List<Point> points;

    Figure(List<Point> points) {
        this.points = points;
    }

    double calculateLength(int first, int second) {
        Point firstPoint = points.get(first);
        Point secondPoint = points.get(second);
        return firstPoint.calculateDistanceFrom(secondPoint);
    }

    public boolean isDuplicate() {
        Set<Point> unique = new HashSet<>();
        for (Point point : points) {
            if (!unique.add(point)) return true;
        }
        return false;
    }
}