package coordinate.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Shape {

    public abstract double calculateArea();

    static Integer[] returnXSet(List<Point> points) {
        Set<Integer> xSet = new HashSet<>();
        for (Point point : points) {
            xSet.add(point.getX());
        }
        return xSet.toArray(new Integer[2]);
    }

    static Integer[] returnYSet(List<Point> points) {
        Set<Integer> ySet = new HashSet<>();
        for (Point point : points) {
            ySet.add(point.getY());
        }
        return ySet.toArray(new Integer[2]);
    }
}