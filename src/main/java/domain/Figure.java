package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Figure {

    public static final int EXIST = 1;
    public static final int NONE = 0;

    protected List<Point> points;

    protected Figure(List<Point> points) throws IllegalArgumentException {
        this.points = points;
    }

    abstract public double area();

    abstract public String printArea();

    protected Point findIdx(int idx) {
        return this.points.get(idx);
    }

    protected static List<Point> checkSamePoint(List<Point> points) {
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
