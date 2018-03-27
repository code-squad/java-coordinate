package coordinate.domain;

import coordinate.view.Output;

import java.util.List;

import static coordinate.domain.Line.LINE;
import static coordinate.domain.Square.SQUARE;
import static coordinate.domain.Triangle.TRIANGLE;

public class Factory {

    public static Calculable ofFigure(List<Point> points) throws IllegalArgumentException {
        if (points.size() == LINE) {
            return Line.ofLine(points);
        }
        if (points.size() == SQUARE && Square.isValid(points)) {
            return Square.ofSquare(points);
        }
        if (points.size() == TRIANGLE) {
            return Triangle.ofTriangle(points);
        }
        Output.printMessage("선, 삼각형이나 사각형의 좌표가 아닙니다.");
        throw new IllegalArgumentException();
    }
}