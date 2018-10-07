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

    public Boolean isThis(int figure) {
        return this.points.size() == figure;
    }

    public double getDistance() {
        return this.points.get(0).getDistance(this.points.get(1));
    }

    public Point searchSameYPoint(Point p) throws Exception {
        for (int i = 1; i < this.points.size(); i++) {
            if (p.isSameY(this.points.get(i))) return this.points.get(i);
        }
        throw new Exception();
    }

    public Point searchSameXPoint(Point p) throws Exception {
        for (int i = 1; i < this.points.size(); i++) {
            if (p.isSameX(this.points.get(i))) return this.points.get(i);
        }
        throw new Exception();
    }

    public int getRectangularArea() {
        try {
            Point p = this.points.get(0);
            int horizontal = (int) p.getDistance(searchSameYPoint(p));
            int vertical = (int) p.getDistance(searchSameXPoint(p));

            return horizontal * vertical;
        } catch (Exception e) {
            return 0;
        }
    }

}
