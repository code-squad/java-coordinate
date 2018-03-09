import java.util.List;

public class Line extends Figure {
    public Line(List<String> points) {
        super(points);
    }

    double distance = super.distance(getPoint(1), getPoint(0));
}
