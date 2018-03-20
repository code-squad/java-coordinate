package domain.point;

import java.util.ArrayList;

public class Points {
    private static Points pointRepository = new Points();
    private ArrayList<Point> points = new ArrayList<>();

    private Points() {
    }

    public static Points of() {
        return pointRepository;
    }

    public void addPoint(int xPosition, int yPosition) throws IllegalArgumentException {
        points.add(new Point(xPosition, yPosition));
    }

    public int getXPositionLimit() {
        Point firstPoint = points.get(0);
        return firstPoint.getXPositionLimit();
    }

    public int getYPositionLimit() {
        Point firstPoint = points.get(0);
        return firstPoint.getYPositionLimit();
    }
}
