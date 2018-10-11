package coordinate.controller;

import coordinate.domain.Point;
import coordinate.domain.Triangle;

import java.util.List;

public class TriangleFactory {
    public static final int THREE = 3;

    public static Triangle generateTriangle(List<Point> points) {
        return new Triangle(points);
    }

    public static boolean isPossibleTriangle(List<Point> points){
        return points.size() == THREE;
    }
}
