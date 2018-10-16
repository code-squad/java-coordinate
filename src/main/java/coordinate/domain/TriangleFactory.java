package coordinate.domain;

import coordinate.util.InputException;

import java.util.List;

public class TriangleFactory implements FigureCreator {
    @Override
    public Figure create(List<Point> points) throws InputException {
        return new Triangle(points);
    }
}
