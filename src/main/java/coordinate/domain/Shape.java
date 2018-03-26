package coordinate.domain;

import coordinate.view.Output;

import java.util.List;

public abstract class Shape {
    static final int FIRST = 0;
    static final int SECOND = 1;
    static final int THIRD = 2;
    private static final int LINE = 2;
    private static final int SQUARE = 4;
    private static final int TRIANGLE = 3;

    public abstract double calculate();

    public static Shape ofShape(List<Point> points) throws IllegalArgumentException {
        if (points.size() == LINE) {
            return Line.ofLine(points);
        }
        if (points.size() == SQUARE) {
            return Square.ofSquare(points);
        }
        if (points.size() == TRIANGLE) {
            return Triangle.ofTrianle(points);
        }
        Output.printMessage("직선이나 직사각형이 아닙니다.");
        throw new IllegalArgumentException();
    }

    public abstract boolean isMatch(int x, int y);
}