package coordinate.factory;

import coordinate.Point;
import coordinate.figure.Figure;
import coordinate.figure.Triangle;

import java.util.List;

public class TriangleFactory implements FigureFactory {
    @Override
    public Figure create(List<Point> points) {
        return new Triangle(points);
    }
}
