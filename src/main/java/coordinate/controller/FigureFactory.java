package coordinate.controller;

import coordinate.domain.Figure;
import coordinate.domain.Point;

import java.util.List;

interface FigureFactory {
    Figure create(List<Point> points);
}
