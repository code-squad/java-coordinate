package domain.point;

import java.util.ArrayList;
import java.util.List;

public class Points {
    private List<Point> points = new ArrayList<>();

    public void addPoint(int xPosition, int yPosition) throws IllegalArgumentException {
        Point point = new Point(xPosition, yPosition);
        if (points.contains(point)) {
            throw new IllegalArgumentException("입력된 좌표가 중복입니다.");
        }
        points.add(point);
    }

    public List<Point> getPoints() {
        return this.points;
    }

    public int getSavedSize() {
        return points.size();
    }

    public int getPointXPosition(int position) {
        Point searchPoint = points.get(position);
        return searchPoint.getXPosition();
    }

    public int getPointYPosition(int position) {
        Point searchPoint = points.get(position);
        return searchPoint.getYPosition();
    }
}
