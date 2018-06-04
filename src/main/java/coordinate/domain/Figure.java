package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure {

    // 각각의 포인트 값을 가진다.
    private List<Point> values = new ArrayList<>();

    Figure(List<String> points) {
        for (String point : points) {
            values.add(new Point(point));
        }
    }

    public Point getPoint(int i) {
        return values.get(i);
    }

    public double getDistance(int i, int j) {
        return getPoint(i).sideLength(getPoint(j));
    }

    interface Area {
        double area();
    }
}
