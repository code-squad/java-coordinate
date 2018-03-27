package coordinate.domain;

import java.util.List;

import static coordinate.domain.Line.LINE;
import static coordinate.domain.Square.SQUARE;
import static coordinate.domain.Triangle.TRIANGLE;

public class Factory {

    public static Figure ofFigure(List<Point> points) {
        if (points.size() == LINE) {
            return Line.ofLine(points);
        }
        if (points.size() == SQUARE) {
            return Square.ofSquare(points);
        }
        if (points.size() == TRIANGLE) {
            return Triangle.ofTriangle(points);
        }
        return null;
    }
}
