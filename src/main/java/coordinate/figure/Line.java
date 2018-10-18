package coordinate.figure;

import coordinate.Point;

import java.util.List;

public class Line extends Figure {
    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public String outputMessage() {
        return name() + area();
    }

    @Override
    public double area() {
        return  getPoints(0).calculatorLength(getPoints(1));
    }

    @Override
    public String name() {
        return "두점 사이의 거리는";
    }
}
