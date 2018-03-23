package saru.domain;

import java.util.*;

public class RowLine {
    private List<Point> points;

    private RowLine(List<Point> points) {
        this.points = points;
    }

    public static RowLine init(int columnNum, int nowRow) {
        List<Point> points = new ArrayList<>();

        // line 초기화
        for (int i = 0; i < columnNum; i++) {
            points.add(new Point(i, nowRow, false));
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
