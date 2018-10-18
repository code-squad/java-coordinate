package coordinate.domain;

import java.util.List;

public abstract class FigureAbstract implements Figure{
    List<Point> points;

    public FigureAbstract(List<Point> points) {
        this.points = points;
    }

    public Point getPoint(int index) {
        return points.get(index);
    }
}
