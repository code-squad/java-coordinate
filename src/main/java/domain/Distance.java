package domain;

import java.util.List;

public class Distance {
    private Distance() {

    }

    public static double getDistance(List<Point> points) {
        return Math.sqrt(Math.pow(points.get(0).getX() - points.get(1).getX(), 2) + Math.pow(points.get(0).getY() - points.get(1).getY(), 2));
    }
}
