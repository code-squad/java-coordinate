package coord.domain;

import java.util.List;


public class Line extends Figure {
    Line(List<Point> points, Point point) {
        super(points);
        this.points.add(point);
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
