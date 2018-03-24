package coordinate.domain;

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
        throw new IllegalArgumentException();
    }

    public static boolean isLine(Shape shape) { //이게 괜찮을지 모르겠다
        return shape instanceof Line;
    }

    public static boolean isSquare(Shape shape) { //이게 괜찮을지 모르겠다
        return shape instanceof Square;
    }
}