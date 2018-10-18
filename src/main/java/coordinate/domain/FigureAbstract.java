package coordinate.domain;

import java.util.List;

public abstract class FigureAbstract implements Figure{
    List<Point> points = null;

    public FigureAbstract(List<Point> points) {
        this.points = points;
    }
    abstract int size();

    public Point getPoint(int index) {
        return points.get(index);
    }
}
