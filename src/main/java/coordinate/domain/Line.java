package coordinate.domain;

import java.util.List;

public class Line extends FigureAbstract {

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double getArea() {
        return getPoint(0).getDistance(getPoint(1));
    }

    @Override
    public String getMessage() {
        return "\n두 점 사이 거리는 ";
    }

    @Override
    public String getName() {
        return "";
    }
}
