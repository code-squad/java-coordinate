package coord.domain;

import java.util.List;
import java.util.stream.Stream;

public abstract class Figure implements Area {
    private List<Point> points;

    Figure(List<Point> points) {
        this.points = points;
    }

    Point getPoint(int index) {
        return points.get(index);
    }

    Stream<Point> getPointStream(){
        return points.stream();
    }

    abstract public String figureKind();
}
