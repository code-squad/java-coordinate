package domain;

import java.util.List;

public class Line {
    public double getLength(List<Point> points) {
        return points.get(0).calculateLength(points.get(1));
    }
}