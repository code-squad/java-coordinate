package controller;

import domain.Figure;
import domain.Point;
import domain.Triangle;

import java.util.List;

public class TriangleFactory implements FigureFactory {

    @Override
    public Figure create(List<Point> points) {
        return new Triangle(points);
    }
}
