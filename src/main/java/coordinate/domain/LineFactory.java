package coordinate.domain;

import java.util.ArrayList;

public class LineFactory implements FigureCreator {
    @Override
    public AbstractFigure create(ArrayList<Point> points) {
        return new Line(points);
    }
}
