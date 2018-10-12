package domain;

import java.util.List;

public class Triangle extends Figure {

    @Override
    double calculateWide(List<Point> points) {
        Point p1 = points.get(0), p2 = points.get(1), p3 = points.get(2);
        double a = p1.calculateLength(p2);
        double b = p2.calculateLength(p3);
        double c = p3.calculateLength(p1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
