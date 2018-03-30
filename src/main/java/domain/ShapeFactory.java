package domain;

import java.util.List;

public class ShapeFactory extends Exception {
    public static Shape getInstance(List<Point> points, LineList lineList) {
        Shape shape = null;
        if (ShapeType.LINE.isLine(points.size())) {
            shape = new Line(points);
        }
        if (ShapeType.TRIANGLE.isTriangle(points.size())) {
            shape = new Triangle(lineList);
        }
        if (ShapeType.RECTANGLE.isRectangle(points.size())) {
            shape = new Rectangle(lineList);
        }
        return shape;
    }
}
