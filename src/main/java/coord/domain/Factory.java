package coord.domain;

import java.util.List;

public class Factory {
    public static Figure of(List<Point> points) {
        Figure figure = points.get(0);
        for (int i = 1; i < points.size(); i++) {
            figure = figure.addPoint(points.get(i));
        }
        return figure;
    }
}
