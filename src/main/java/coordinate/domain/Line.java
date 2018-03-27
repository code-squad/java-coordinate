package coordinate.domain;

import coordinate.view.Output;

import java.util.List;

public class Line extends Figure {
    private static final int LINE = 2;
    private static final int FIRST = 0;
    private static final int SECOND = 1;
    private final List<Point> points;

    private Line(List<Point> points) {
        this.points = points;
    }

    public static Line ofLine(List<Point> points) throws IllegalArgumentException {
        if (Utils.isDuplicate(points)) {
            Output.printMessage("중복되는 좌표가 있습니다. 세 점의 위치는 달라야 합니다.");
            throw new IllegalArgumentException();
        }
        return new Line(points);
    }

    public static boolean isLine(List<Point> points) {
        return points.size() == LINE;
    }

    public double calculate() {
        return points.get(FIRST).calculateDistanceFrom(points.get(SECOND));
    }

    public boolean isMatch(int x, int y) {
        Point a = points.get(FIRST);
        Point b = points.get(SECOND);
        return a.xEquals(x) && a.yEquals(y) || b.xEquals(x) && b.yEquals(y);
    }
}