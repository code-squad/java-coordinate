package coordinate.domain;

import java.util.ArrayList;

public interface FigureCreator {
    AbstractFigure create(ArrayList<Point> points);
}
