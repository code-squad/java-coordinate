package domain;

import java.util.List;

public class Line implements Figure {

    @Override
    public double area(List<Point> points) {
        Point p1 = points.get(0);
        Point p2 = points.get(1);
        return p1.calculateLength(p2);
    }

}
