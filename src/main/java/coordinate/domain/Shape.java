package coordinate.domain;

import coordinate.view.Output;

import java.util.List;

public abstract class Shape {

    public abstract double calculate();

    public static Shape ofShape(List<Point> points) throws IllegalArgumentException {
        Line line = Line.ofLine(points);
        Square square = Square.ofSquare(points);
        if (line.isLine()) {
            return line;
        }
        if (square.isSquare()) {
            return square;
        }
        Output.printMessage("직선이나 직사각형이 아닙니다.");
        throw new IllegalArgumentException();
    }

    public abstract boolean isMatch(int x, int y);
}