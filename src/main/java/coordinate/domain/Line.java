package coordinate.domain;

import java.util.List;

public class Line extends AbstractFigure {
    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public String name() {
        return "두 점";
    }

    @Override
    public double area() {
        return getDist(0, 1);
    }

    @Override
    public String outputMessage() {
        return name() + " 사이의 거리는 " + String.format("%.6f", area());
    }
}
