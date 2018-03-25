package coordinate.domain;

import java.util.List;

public class Line {
    private static Point pointFirst;
    private static Point pointSecond;

    public Line(List<String> points) {
        pointFirst = new Point(points.get(0));
        pointSecond = new Point(points.get(1));
    }

    public int xDistance() {
        return Math.abs(getPointSecondX() - getPointFirstX());
    }

    public int yDistance() {
        return Math.abs(getPointSecondY() - getPointFirstY());

    }

    public double calculateDistance() {
        return Math.sqrt(Math.pow(xDistance(), 2) + Math.pow(yDistance(), 2));
    }

    public static int getPointFirstX() {
        return pointFirst.getX();
    }

    public static int getPointFirstY() {
        return pointFirst.getY();
    }

    public static int getPointSecondX() {
        return pointSecond.getX();
    }

    public static int getPointSecondY() {
        return pointSecond.getY();
    }
}
