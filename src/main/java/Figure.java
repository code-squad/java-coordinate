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
}

interface Area {
    public double area();
}