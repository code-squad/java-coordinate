package coord.domain;

import java.util.List;

public class Line extends Figure {

    Line(List<Point> points) {
        super(points);
    }

    @Override
    public double area() {
        return getPoint(0).distanceTo(getPoint(1));
    }

    @Override
    public String figureKind() {
        return "직선";
    }
}
