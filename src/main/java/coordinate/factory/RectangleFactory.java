package coordinate.factory;

import coordinate.Point;
import coordinate.figure.Figure;
import coordinate.figure.Rectangle;

import java.util.List;

public class RectangleFactory implements FigureFactory {
    @Override
    public Figure create(List<Point> points) {
        return new Rectangle(points);
    }
}
