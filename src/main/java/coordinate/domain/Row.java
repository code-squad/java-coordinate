package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private static final int DOMAIN = 24;
    private final List<Point> row = new ArrayList<>();

    private Row(int dotIndex) {
        for (int x = 0; x <= DOMAIN; x++) {
            row.add(addPoint(dotIndex, x));
        }
    }

    public static Row ofPointOnRow(int dotIndex) {
        return new Row(dotIndex);
    }

    public static Row ofPointNotOnRow() {
        return new Row(-1); // x never reaches -1
    }

    Point addPoint(int dotIndex, int x) {
        if (x == dotIndex) {
            return Point.ofPoint();
        }
        return Point.ofNoPoint();
    }

    public boolean dotAtPoint(int x) {
        return row.get(x).isDot();
    }

    public int getRowSize() {
        return row.size();
    }
}