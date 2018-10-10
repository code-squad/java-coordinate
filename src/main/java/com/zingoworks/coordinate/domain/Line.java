package com.zingoworks.coordinate.domain;

import java.util.List;

public class Line {
    private Point x;
    private Point y;

    public Line(List<Point> point) {
        if (point.size() != 2) {
            throw new IllegalArgumentException("직선의 성립조건이 아닙니다.");
        }
        this.x = point.get(0);
        this.y = point.get(1);
    }

    public double getDistanceOfLine() {
        return x.getDistance(y);
    }
}