package domain;

import java.util.List;

public interface FigureCreator {
    Figure create(List<Point> points);
}
