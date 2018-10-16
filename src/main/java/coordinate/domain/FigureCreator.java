package coordinate.domain;

import coordinate.util.InputException;

import java.util.List;

public interface FigureCreator {
    Figure create(List<Point> points) throws InputException;
}
