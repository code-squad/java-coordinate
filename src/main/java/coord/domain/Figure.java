package coord.domain;

import java.util.List;

public abstract class Figure implements Area {
    private List<Point> points;

    Figure(List<Point> points) {
        this.points = points;
    }

    protected List<Point> getPoints() {
        return points;
    }

    abstract public String figureKind();
}
