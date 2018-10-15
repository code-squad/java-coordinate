package domain;

import java.util.List;

public class Line {
    private Point p1;
    private Point p2;

    public Line(List<Point> pointList) {
        this.p1 = pointList.get(0);
        this.p2 = pointList.get(1);
    }

    public double calcLength() {
        return Math.sqrt(Math.pow(p1.subtractXPoint(p2), 2) + Math.pow(p1.subtractYPoint(p2), 2));
    }
}