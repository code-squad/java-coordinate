package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private static final int DOMAIN = 24;
    private final List<Point> points = new ArrayList<>();

    Row() {
        for (int x = 0; x <= DOMAIN; x++) {
            points.add(Point.ofNoPoint());
        }
    }

    public boolean dotAtPoint(int x) {
        return points.get(x).isDot();
    }

    public int getRowSize() {
        return points.size();
    }
}