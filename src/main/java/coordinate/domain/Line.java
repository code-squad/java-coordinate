package coordinate.domain;

import java.util.List;

public class Line extends Figure {

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double getArea() {
        return getPoint(0).getDistance(getPoint(1));
    }

    @Override
    public String getName() {
        return "Line";
    }

    @Override
    int size() {
        return 2;
    }
}
