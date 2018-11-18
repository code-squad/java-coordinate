package coordinate.domain.Figure;

import coordinate.domain.Point;

import java.util.List;

public interface FigureCreator {
    Figure create(List<Point> coordinates);
}
