package domain;

import additionalException.DuplicatePointException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Figure extends FigureFactory implements FigureInformation {
    private List<Point> points;

    Figure(List<Point> points) {
        checkDuplicationPoint(points);
        this.points = points;
    }

    protected Point getPoint(int index) {
        return points.get(index);
    }

    public List<Point> getPoints(){
        return points;
    }

    protected int getPointsSize() {
        return points.size();
    }

    private void checkDuplicationPoint(List<Point> points) {
        Set<Point> copyOfPoints = new HashSet<>(points);
        if (points.size() != copyOfPoints.size())
            throw new DuplicatePointException("위치가 같은 점(point)이 존재합니다. 모든 점들의 위치는 달라야 합니다.");
    }

    protected void checkSize(int size) {
        if (points.size() != size) {
            throw new IllegalArgumentException();
        }
    }
}
