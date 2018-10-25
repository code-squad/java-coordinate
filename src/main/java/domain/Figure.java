package domain;

import additionalException.DuplicatePointException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Figure {
    private final int MIN_RANGE = 0;
    private final int MAX_RANGE = 5;

    private List<Point> points;

    Figure(List<Point> points) {
        checkDuplicationPoint(points);
        checkSize(points);
        this.points = points;
    }

    protected Point getPoint(int index) {
        return points.get(index);
    }

    protected int getPointsSize() {
        return points.size();
    }

    private void checkDuplicationPoint(List<Point> points) {
        Set<Point> copyOfPoints = new HashSet<>(points);
        if (points.size() != copyOfPoints.size())
            throw new DuplicatePointException("위치가 같은 점(point)이 존재합니다. 모든 점들의 위치는 달라야 합니다.");
    }

    private void checkSize(List<Point> points) {
        if (points.size() <= MIN_RANGE || points.size() >= MAX_RANGE) {
            throw new IllegalArgumentException();
        }
    }

    protected abstract double area();
}
