package coordinate.domain;

import java.util.List;

public class Line {
    private static final int FIRST_POINT = 0;
    private static final int SECOND_POINT = 1;

    public static double calculateDistance(List<Point> points) {
        double xSquared = Math.pow(points.get(FIRST_POINT).getX() - points.get(SECOND_POINT).getX(), 2);
        double ySquared = Math.pow(points.get(FIRST_POINT).getY() - points.get(SECOND_POINT).getY(), 2);
        return Math.sqrt(xSquared + ySquared);
    }

    public static boolean isLine(List<Point> points) {
        return points.size() == 2;
    }
}