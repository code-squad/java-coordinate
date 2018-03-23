package domain;

import java.util.ArrayList;

public class CoordinateCalculator {
    public static Double calculateLength(ArrayList<Point> points) {
        Point a = points.get(0);
        Point b = points.get(1);
        return calculatePoints(a, b);
    }

    private static Double calculatePoints(Point a, Point b) {
        int aX = a.getX();
        int aY = a.getY();
        int bX = b.getX();
        int bY = b.getY();
        return Math.sqrt(Math.pow((aX - bX), 2) + Math.pow((aY - bY), 2));
    }
}
