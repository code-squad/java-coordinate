package coordinate.domain;

import java.util.List;

public class LineFactory implements FigureCreator {
    @Override
    public AbstractFigure create(List<Point> points) {
        return new Line(points);
    }
}
