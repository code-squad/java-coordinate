package domain;

import java.util.ArrayList;
import java.util.List;

public class Figure {
    public static final int RECTANGLE = 4;
    public static final int TRIANGLE = 3;
    public static final int LINE = 2;

    public static final int EXIST = 1;
    public static final int NONE = 0;

    List<Point> points;

    public Figure(List<Point> points) {
        this.points = points;
    }

    public static Figure init(List<Point> points) {
        if (points.size() == RECTANGLE)
            return new Rectangle(points);
        if (points.size() == TRIANGLE)
            return new Triangle(points);
        if (points.size() == LINE)
            return new Line(points);
        return new Figure(points);
    }

    public List<Integer> makeLine(int y) {
        List<Integer> points = new ArrayList<>();
        for (int i = 0; i <= Point.MAXSIZE; i++) {
            points.add(searchSamePoint(i, y));
        }
        return points;
    }

    private int searchSamePoint(int x, int y) {
        Point tmp = Point.init(x, y);

        for (Point p : this.points) {
            if (p.equals(tmp))
                return EXIST;
        }
        return NONE;
    }

    Point findIdx(int idx) {
        return this.points.get(idx);
    }

    public double calc() {
        return 0;
    }

}
