package coordinate.domain;

import java.util.List;

import static coordinate.domain.Utils.LINE;
import static coordinate.domain.Utils.SQUARE;
import static coordinate.domain.Utils.TRIANGLE;

public class Factory {

    public static Figure ofFigure(List<Point> points) {
        int figure = Figure.isWhichFigure(points);
        if (figure == LINE) {
            return Line.ofLine(points);
        }
        if (figure == SQUARE) {
            return Square.ofSquare(points);
        }
        if (figure == TRIANGLE) {
            return Triangle.ofTriangle(points);
        }
        return null;
    }
}