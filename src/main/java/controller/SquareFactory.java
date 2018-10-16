package controller;

import domain.Figure;
import domain.Point;
import domain.Square;

import java.util.List;

public class SquareFactory implements FigureFactory {

    @Override
    public Figure create(List<Point> points) {
        return new Square(points);
    }
}
