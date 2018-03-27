package coordinate.domain;

import coordinate.view.Output;

import java.util.List;

import static coordinate.domain.Utils.LINE;
import static coordinate.domain.Utils.SQUARE;
import static coordinate.domain.Utils.TRIANGLE;

public abstract class Figure {
    static final int FIRST = 0;
    static final int SECOND = 1;

    public abstract double calculate();

    public abstract boolean isMatch(int x, int y);

    static double calculateLength(List<Point> twoPoints) {
        Point firstPoint = twoPoints.get(FIRST);
        Point secondPoint = twoPoints.get(SECOND);
        return firstPoint.calculateDistanceFrom(secondPoint);
    }

    static int isWhichFigure(List<Point> points) throws IllegalArgumentException {
        if (points.size() == LINE) {
            return LINE;
        }
        if (points.size() == SQUARE) {
            return SQUARE;
        }
        if (points.size() == TRIANGLE) {
            return TRIANGLE;
        }
        Output.printMessage("직선, 직사각형이나 삼각형이 아닙니다.");
        throw new IllegalArgumentException();
    }
}