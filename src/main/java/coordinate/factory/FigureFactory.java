package coordinate.factory;

import coordinate.Point;
import coordinate.figure.Figure;

import java.util.List;

public interface FigureFactory {
     Figure create(List<Point> points);
}
