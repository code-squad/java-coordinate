package coordinate.controller;

import coordinate.domain.Figure;
import coordinate.domain.Point;
import coordinate.domain.Triangle;

import java.util.List;

public class TriangleFactory implements FigureFactory {
    @Override
    public Figure create(List<Point> points) {
        return new Triangle(points);
    }
}
