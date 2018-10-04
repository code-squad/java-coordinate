package coord.domain;

import java.util.List;

public class Line {
    private List<Point> points;

    private Line(List<Point> points) {
        if (points.size() != 2) {
            throw new IllegalArgumentException();
        }
        this.points = points;
    }

    public static Line of(List<Point> points) {
        return new Line(points);
    }

    public double length() {
        return points.get(0).distanceTo(points.get(1));
    }
}
