package coord.domain;

import java.util.List;

public class Triangle extends Figure {

    Triangle(List<Point> points, Point point) {
        super(points);
        points.add(point);
    }

    @Override
    public double size() {
        return 3.0; //TODO
    }

    @Override
    public Figure addPoint(Point point) {
        return new Rectangle(this.points, point);
    }

    @Override
    public String figureKind() {
        return "삼각형";
    }
}
