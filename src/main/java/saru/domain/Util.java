package saru.domain;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

public class Util {
    private Util() {
        // empty
    }

    public static double getMinXValue(Set<Point> points) {
        Point minXPoint = Collections.min(points, Comparator.comparing(Point::getX));
        return minXPoint.getX();
    }

    public static double getMinYValue(Set<Point> points) {
        Point minYPoint = Collections.min(points, Comparator.comparing(Point::getY));
        return minYPoint.getY();
    }

    public static double getMaxXValue(Set<Point> points) {
        Point maxXValue = Collections.max(points, Comparator.comparing(Point::getX));
        return maxXValue.getX();
    }

    public static double getMaxYValue(Set<Point> points) {
        Point maxYValue = Collections.max(points, Comparator.comparing(Point::getY));
        return maxYValue.getY();
    }
}