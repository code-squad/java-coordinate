package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Figure {
    public static final int RECTANGLE = 4;
    public static final int TRIANGLE = 3;
    public static final int LINE = 2;

    public static final int EXIST = 1;
    public static final int NONE = 0;

    protected List<Point> points;

    protected Figure(List<Point> points) throws IllegalArgumentException {
        this.points = checkSamePoint(points);
    }

    public static Figure init(List<Point> points) throws IllegalArgumentException {
        if (points.size() == RECTANGLE)
            return new Rectangle(points);
        if (points.size() == TRIANGLE)
            return new Triangle(points);
        if (points.size() == LINE)
            return new Line(points);
        return new Dot(points);
    }

    abstract public double area();

    abstract public String printArea();

    protected  Point findIdx(int idx) {
        return this.points.get(idx);
    }

    private static List<Point> checkSamePoint(List<Point> points) {
        Set<Point> set = new HashSet<>(points);
        if (!(points.size() == set.size()))
            throw new IllegalArgumentException("중복된 Point가 있습니다.");
        return points;
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

}
