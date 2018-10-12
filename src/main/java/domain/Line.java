package domain;

import java.util.List;

public class Line extends Figure {

    @Override
    double calculateWide(List<Point> points) {
        Point p1 = points.get(0);
        Point p2 = points.get(1);
        return p1.calculateLength(p2);
    }
}
