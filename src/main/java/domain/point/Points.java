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

    public void cleanPointRepository() {
        points.clear();
    }

    public void addPoint(int xPosition, int yPosition) throws IllegalArgumentException {
        Point point = new Point(xPosition, yPosition);
        if (points.contains(point)) {
            throw new IllegalArgumentException("입력된 좌표가 중복입니다.");
        }
        points.add(point);
    }

    public int getXPositionLimit() {
        Point firstPoint = points.get(0);
        return firstPoint.getXPositionLimit();
    }

    public int getYPositionLimit() {
        Point firstPoint = points.get(0);
        return firstPoint.getYPositionLimit();
    }

    public ArrayList<Point> getDrawPoints() {
        return this.points;
    }

    public ArrayList<Point> getDistanceCalcPoints() {
        int calcNum = 2;
        ArrayList<Point> distancePoints = new ArrayList<>();
        for (int i = 0; i < calcNum; i++) {
            distancePoints.add(points.get(i));
        }
        return distancePoints;
    }
}
