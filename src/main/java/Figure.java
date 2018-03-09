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

//    public double distance(List<String> points) {
//        Line line = new Line(points);
//        Point start = values.get(0);
//        Point end = values.get(1);
//        return line.distance(start, end);
//    }
}

interface Area {
    public double area();
}