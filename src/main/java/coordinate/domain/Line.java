package coordinate.domain;

import java.util.List;

import static coordinate.domain.Utils.FIRST;
import static coordinate.domain.Utils.SECOND;

public class Line extends Figure {
    static final int LINE = 2;

    private Line(List<Point> points) {
        super(points);
    }

    public static Line ofLine(List<Point> points) {
        return new Line(points);
    }

    public double calculate() {
        return calculateLength(FIRST, SECOND);
    }

    public boolean isMatch(int x, int y) {
        Point a = points.get(FIRST);
        Point b = points.get(SECOND);
        return a.xEquals(x) && a.yEquals(y) || b.xEquals(x) && b.yEquals(y);
    }

    public String getType() {
        return "Line";
    }
}