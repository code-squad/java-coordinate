import java.util.List;

public class Line extends Figure {
    public Line(List<String> points) {
        super(points);
    }

    public double distance(Point p1, Point p2) {
        return Math.pow((Math.pow(p1.xValue() - p2.xValue(), 2) + Math.pow(p1.xValue() - p2.yValue(), 2)), 0.5);
    }

//    double distance = super.distance(getPoint(1), getPoint(0));

}
