package coordinate.controller;

import coordinate.domain.Point;
import coordinate.domain.Rectangle;

import java.util.List;

public class RectangleFactory {
    public static final int FOUR = 4;

    public static Rectangle generateRectangle(List<Point> points) {
        return new Rectangle(points);
    }

    public static boolean isPossibleRectangle(List<Point> points){
        return points.size() == FOUR;
    }
}
