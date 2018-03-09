import java.util.List;

public class Line extends Figure {
    public Line(List<String> points) {
        super(points);
    }

    double distance = super.getPoint(1).disance(super.getPoint(0));

}
