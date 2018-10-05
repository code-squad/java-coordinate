package domain;

import java.util.ArrayList;
import java.util.List;

public class Points {

    public static final int EXIST = 1;
    public static final int NONE = 0;

    private List<Point> points;

    private Points(List<Point> point) {
        this.points = point;
    }

    public static Points init(List<Point> points) {
        return new Points(points);
    }

    public List<Integer> makeLine(int y) {
        List<Integer> points = new ArrayList<>();
        for (int i = 0; i <= Point.MAXSIZE; i++) {
            points.add(searchSameXPoint(i, y));
        }
        return points;
    }

    private int searchSameXPoint(int x, int y) {
        for (Point p : this.points) {
            if (p.isSameX(x) && p.isSameY(y))
                return EXIST;
        }
        return NONE;
    }

    public double calc() {
        if (this.points.size() == 2) {
            return getDistance();
        }
        return 0;
    }

    public double getDistance() {
        return this.points.get(0).getDistance(this.points.get(1));
    }
}
