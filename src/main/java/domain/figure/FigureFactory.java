package domain.figure;

import domain.point.Point;

import java.util.ArrayList;

public class FigureFactory {

    public static Figure of(ArrayList<Point> points) {
        if (Rectangle.isInvalidPointNum(points)) {
            return new Triangle(points);
        }
        return new Rectangle(points);
    }
}
