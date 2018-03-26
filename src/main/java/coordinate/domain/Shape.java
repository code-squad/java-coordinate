package coordinate.domain;

import coordinate.view.Output;

import java.util.List;

public abstract class Shape {
    private static final int TWO_POINTS = 2;
    private static final int FOUR_POINTS = 4;

    public abstract double calculate();

    public static Shape ofShape(List<Point> points) throws IllegalArgumentException {
        if (points.size() == TWO_POINTS) {
            return Line.ofLine(points);
        }
        if (points.size() == FOUR_POINTS) {
            return Square.ofSquare(points);
        }
        Output.printMessage("직선이나 직사각형이 아닙니다.");
        throw new IllegalArgumentException();
    }

    public abstract boolean isMatch(int x, int y);
}