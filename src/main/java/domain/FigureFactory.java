package domain;

import java.util.List;

public interface FigureFactory {
    Figure create(List<Point> points);
}
