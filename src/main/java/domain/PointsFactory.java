package domain;

import additionalException.DuplicatePointException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PointsFactory {
    private static final int X_POSITION = 0;
    private static final int Y_POSITION = 1;

    public static List<Point> makePoints(List<Integer[]> positions) {
        List<Point> points = new ArrayList<>();
        for (Integer[] position : positions) {
            Point point = new Point(position[X_POSITION], position[Y_POSITION]);
            points.add(point);
        }
        checkDuplicationPoint(points);
        return points;
    }

    private static void checkDuplicationPoint(List<Point> points) {
        Set<Point> copyOfPoints = new HashSet<>(points);
        if (points.size() != copyOfPoints.size())
            throw new DuplicatePointException("위치가 같은 점(point)이 존재합니다. 세 점의 위치는 달라야 합니다.");
    }
}