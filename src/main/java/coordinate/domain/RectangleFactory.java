package coordinate.domain;

import java.util.ArrayList;

public class RectangleFactory implements FigureCreator {
    @Override
    public AbstractFigure create(ArrayList<Point> points) {
        return new Rectangle(points);
    }
}
