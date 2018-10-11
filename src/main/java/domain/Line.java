package domain;

import java.util.List;

public class Line extends Figure {

    Line(List<Point> points) {
        super(checkSamePoint(points));
    }

    private double getDistance() {
        return findIdx(0).getDistance(findIdx(1));
    }

    @Override
    public double area() {
        return getDistance();
    }

    @Override
    public String printArea() {
        return "직선의 길이는 " + area();
    }

}
