package coordinate.controller;

import coordinate.domain.Figure;
import coordinate.domain.Line;
import coordinate.domain.Point;

import java.util.List;

public class LineFactory implements FigureFactory{
    @Override
    public Figure create(List<Point> points) {
        return new Line(points);
    }
}
