import java.util.ArrayList;
import java.util.List;

public abstract class Figure {
    private List<Point> values = new ArrayList<>();

    Figure(List<String> points) {
        for (String point : points) {
            values.add(new Point(point));
        }
    }

    public Point getPoint(int i) {
        return values.get(i);
    }

    public double distance(Point first, Point second) {
        return Math.pow((Math.pow(first.xValue() - second.xValue(), 2) + Math.pow(first.yValue() - second.yValue(), 2)) , 0.5);
    }

    public abstract double area();
}
