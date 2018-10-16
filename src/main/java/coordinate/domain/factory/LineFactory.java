package coordinate.domain.factory;

import coordinate.domain.AbstractFigure;
import coordinate.domain.FigureCreator;
import coordinate.domain.Line;
import coordinate.domain.Point;

import java.util.List;

public class LineFactory implements FigureCreator {
    @Override
    public AbstractFigure create(List<Point> points) {
        return new Line(points);
    }
}
