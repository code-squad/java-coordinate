package domain.figure;

import domain.point.Point;

import java.util.List;

public class FigureFactory {

    public static Figure of(List<Point> points) {
        if (Rectangle.isInvalidPointNum(points)) {
            return new Triangle(points);
        }
        return new Rectangle(points);
    }
}
