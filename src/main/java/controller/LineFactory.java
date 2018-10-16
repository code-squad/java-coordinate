package controller;

import domain.Figure;
import domain.Line;
import domain.Point;

import java.util.List;

public class LineFactory implements FigureFactory {

    @Override
    public Figure create(List<Point> points) {
        return new Line(points);
    }
}
