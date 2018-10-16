package controller;

import domain.Figure;
import domain.Point;

import java.util.List;

public interface FigureFactory {
    Figure create(List<Point> points);
}
