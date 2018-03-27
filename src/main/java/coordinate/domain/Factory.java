package coordinate.domain;

import coordinate.view.Output;

import java.util.List;

public class Factory {

    public static Figure ofShape(List<Point> points) throws IllegalArgumentException {
        if (Line.isLine(points)) {
            return Line.ofLine(points);
        }
        if (Square.isSquare(points)) {
            return Square.ofSquare(points);
        }
        if (Triangle.isTriangle(points)) {
            return Triangle.ofTrianle(points);
        }
        Output.printMessage("직선, 직사각형이나 삼각형이 아닙니다.");
        throw new IllegalArgumentException();
    }
}