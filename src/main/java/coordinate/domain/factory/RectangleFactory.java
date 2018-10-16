package coordinate.domain.factory;

import coordinate.domain.AbstractFigure;
import coordinate.domain.FigureCreator;
import coordinate.domain.Point;
import coordinate.domain.Rectangle;

import java.util.List;

public class RectangleFactory implements FigureCreator {
    @Override
    public AbstractFigure create(List<Point> points) {
        return new Rectangle(points);
    }
}
