package coordinate.domain;

import java.util.List;

public class TriangleFactory implements FigureCreator {
    @Override
    public AbstractFigure create(List<Point> points) {
        return new Triangle(points);
    }
}
