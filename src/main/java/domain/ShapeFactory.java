package domain;

import java.util.ArrayList;

public class ShapeFactory {
    public static ShapeType shapeType;
//    private static final int LINE = 2;
//    private static final int TRIANGLE = 3;
//    private static final int RECTANGLE = 4;

    public static Shape getInstance(ArrayList<Point> points) {
        Shape shape = null;
        if (points.size() == shapeType.LINE.getPointCount()) {
            shape = new Line(points);
        }
        if (points.size() == shapeType.TRIANGLE.getPointCount()) {
            shape = new Triangle(points);
        }
        if (points.size() == shapeType.RECTANGLE.getPointCount()) {
            shape = new Rectangle(points);
        }
        return shape;
    }
}
