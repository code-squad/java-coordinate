package coordinate.controller;

import coordinate.CoordinateFactory;
import coordinate.domain.Point;
import coordinate.domain.Rectangle;

import java.util.List;

public class RectangleFactory {
    public static Rectangle generateRectangle(List<Point> points) {
        return new Rectangle(points);
    }

    public static boolean isPossibleRectangle(List<Point> points){
        return points.size() == CoordinateFactory.FOUR;
    }


}
