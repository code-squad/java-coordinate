package coordinate.domain;

import java.util.List;

public class Triangle extends Figure{
    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public double getArea() {
        double l1 = getPoint(0).getDistance(getPoint(1));
        double l2 = getPoint(1).getDistance(getPoint(2));
        double l3 = getPoint(2).getDistance(getPoint(0));
        double s = (l1 + l2 + l3) / 2;

        return Math.round(Math.sqrt(s * (s - l1) * (s - l2) * (s - l3)));
    }

    @Override
    public String getName() {
        return "삼각형";
    }

    @Override
    int size() {
        return 3;
    }
}
