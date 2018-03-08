import java.util.List;

public class Line extends Figure {
    public Line(List<String> points) {
        super(points);
    }

    @Override
    public double area() {
        return 0;
    }

    public double distance() {
        return super.distance(getPoint(1), getPoint(0));
    }
}
