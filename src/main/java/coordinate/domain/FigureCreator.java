package coordinate.domain;

import java.util.List;

public interface FigureCreator {
    AbstractFigure create(List<Point> points);
}
