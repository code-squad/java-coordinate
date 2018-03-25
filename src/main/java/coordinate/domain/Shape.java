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

    public static boolean isLine(Shape shape) { //이게 괜찮을지 모르겠다
        return shape instanceof Line;
    }

    public static boolean isSquare(Shape shape) { //이게 괜찮을지 모르겠다
        return shape instanceof Square;
    }

    public abstract boolean isMatch(int x, int y);
}