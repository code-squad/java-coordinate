package domain;

import java.util.ArrayList;

public class ShapeFactory {
    private static final int LINE = 2;
    private static final int RECTANGLE = 4;

    public static Shape getInstance(ArrayList<Point> points) {
        Shape shape = null;
        if (points.size() == LINE) {
            shape = new Line(points);
        }
        if (points.size() == RECTANGLE) {
            shape = new Rectangle(points);
        }
        return shape;
    }
}
