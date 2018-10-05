package coordinate.controller;

import coordinate.CoordinateFactory;
import coordinate.domain.Point;
import coordinate.domain.Rectangle;

import java.util.List;

public class RectangleFactory {
    public static boolean isRectangle(int size) {
        return size == CoordinateFactory.FOUR;
    }

    public static Rectangle generateRectangle(List<Point> points) {
    }
}
