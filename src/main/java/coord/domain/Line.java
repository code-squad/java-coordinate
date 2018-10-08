package coord.domain;

import java.util.Arrays;

public class Line extends Figure{

    Line(Point pointA, Point pointB) {
        this.points = Arrays.asList(pointA, pointB);
    }

    @Override
    public double size() {
        return points.get(0).distanceTo(points.get(1));
    }

    @Override
    public Figure addPoint(Point point) {
        return new Triangle(this.points, point);
    }

    @Override
    public String figureKind() {
        return "직선";
    }
}
