import java.util.List;

public class Line extends Figure {
    public Line(List<String> points) {
        super(points);
    }

    public double distance(Point first, Point second) {
        return Math.pow((Math.pow(first.xValue() - second.xValue(), 2) + Math.pow(first.yValue() - second.yValue(), 2)) , 0.5);
    }
}
