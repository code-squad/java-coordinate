package coordinate.domain.Figure;

import coordinate.domain.Point;

import java.util.List;

public abstract class AbstractFigure implements Figure {
    protected List<Point> coordinate;

    protected AbstractFigure(List<Point> coordinate){
        this.coordinate = coordinate;
    }
}
