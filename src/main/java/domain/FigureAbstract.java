package domain;

import java.util.List;

abstract public class FigureAbstract implements Figure{
    private List<Point> points;

    FigureAbstract(List<Point> points) {
        this.points = points;
    }

    protected List<Point> getPoints() {
        return points;
    }

}
