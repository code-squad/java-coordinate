package domain;

import util.PointException;
import java.util.*;

public class Line implements Figure {
    private List<Point> points;

    public Line(List<Point> points) throws PointException {
        this.points = points;
        Collections.sort(points);
    }

    @Override
    public String evaluate() {
        return stringFormat(points.get(0).getDistance(points.get(1)));
    }

    @Override
    public List<Point> getPoints() {
        return Collections.unmodifiableList(points);
    }

    @Override
    public String stringFormat(Number value) {
        return String.format("두 점 사이의 거리는 : %5f", value);
    }
}
