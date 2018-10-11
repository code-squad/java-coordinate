package coordinate.controller;

import coordinate.domain.Figure;
import coordinate.domain.Point;
import coordinate.domain.Rectangle;

import java.util.List;

public class RectangleFactory implements FigureFactory{
    @Override
    public Figure create(List<Point> points) {
        return new Rectangle(points);
    }
}
