package coordinate.domain.factory;

import coordinate.domain.AbstractFigure;
import coordinate.domain.FigureCreator;
import coordinate.domain.Point;
import coordinate.domain.Triangle;

import java.util.List;

public class TriangleFactory implements FigureCreator {
    @Override
    public AbstractFigure create(List<Point> points) {
        return new Triangle(points);
    }
}
