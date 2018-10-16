package coordinate.figure;

import coordinate.Point;

import java.util.List;

public class Line extends Figure {

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double area() {
        return getPoints().get(0).calculatorLength(getPoints().get(1));
    }

    @Override
    public String name() {
        return "두점 사이의 거리는";
    }

    @Override
    public String toString() {
        return name() + area();
    }
}
