package coord.domain;

import java.util.List;

public class Dot extends Figure {

    Dot(List<Point> points) {
        super(points);
    }

    @Override
    public String figureKind() {
        return "점";
    }

    @Override
    public double area() {
        return 0;
    }
}
