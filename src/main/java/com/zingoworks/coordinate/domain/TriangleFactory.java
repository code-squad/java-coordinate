package com.zingoworks.coordinate.domain;

import java.util.List;

public class TriangleFactory {
    public static Triangle getTriangle(List<Point> points) {
        return new Triangle(points);
    }
}
