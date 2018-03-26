package domain;

import java.util.ArrayList;

public class ShapeFactory {
    public static Shape getInstance(ArrayList<Point> points) {
        Shape shape = null;
        if (points.size() == 2) {
            shape = new Line(points);
        }
        if (points.size() == 4) {
            shape = new Rectangle(points);
        }
        return shape;
    }
}
