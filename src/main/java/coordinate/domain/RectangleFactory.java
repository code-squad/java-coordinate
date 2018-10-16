package coordinate.domain;

import java.util.List;

public class RectangleFactory implements FigureCreator {
    @Override
    public AbstractFigure create(List<Point> points) {
        return new Rectangle(points);
    }
}
