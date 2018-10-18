package coordinate.factory;

import coordinate.Point;
import coordinate.figure.Figure;
import coordinate.figure.Line;

import java.util.List;

public class LineFactory implements FigureFactory {
    @Override
    public Figure create(List<Point> points) {
        return new Line(points);
    }
}
