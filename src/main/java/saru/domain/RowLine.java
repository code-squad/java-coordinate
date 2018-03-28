package saru.domain;

import java.util.*;

public class RowLine {
    private static final int MAX_VALUE = 25;
    private List<Point> points;

    private RowLine(List<Point> points) {
        this.points = points;
    }

    static RowLine init() {
        List<Point> points = new ArrayList<>();

        // line 초기화
        for (int i = 0; i < MAX_VALUE; i++) {
            points.add(new Point(i, MAX_VALUE - 1));
        }

        return new RowLine(points);
    }

    public List<Point> getPoints() {
        return points;
    }

    // 인덴트 2
    Point getSameXPointFor(int x) {
        for (Point point : points) {
            if (point.hasX(x)) {
                return point;
            }
        }

        return null;
    }
}