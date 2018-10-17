package coordinate.domain;

import java.util.ArrayList;

public class TriangleFactory implements FigureCreator{
    @Override
    public AbstractFigure create(ArrayList<Point> points) {
        return new Triangle(points);
    }
}
