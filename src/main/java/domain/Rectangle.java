package domain;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Figure {

    public Rectangle(List<Point> points) throws IllegalArgumentException {
        super(checkRectangle(points));
    }

    private static List<Point> checkRectangle(List<Point> points) throws IllegalArgumentException {
        List<Point> tmp = new ArrayList<>(points);
        Point p = points.get(0);

        p = searchSameXPoint(tmp, p);
        p = searchSameYPoint(tmp, p);
        searchSameXPoint(tmp, p);

        return points;
    }

    public static Point searchSameYPoint(List<Point> points, Point p) {
        points.remove(p);
        for (Point point : points) {
            if (p.isSameY(point)) return point;
        }
        throw new IllegalArgumentException("직사각형이 아닙니다.");
    }

    public static Point searchSameXPoint(List<Point> points, Point p) {
        points.remove(p);
        for (Point point : points) {
            if (p.isSameX(point)) return point;
        }
        throw new IllegalArgumentException("직사각형이 아닙니다.");
    }

    private int getRectangularArea() throws IllegalArgumentException {
        Point p = findIdx(0);
        int horizontal = (int) p.getDistance(searchSameYPoint(points, p));
        int vertical = (int) p.getDistance(searchSameXPoint(points, p));

        return horizontal * vertical;
    }

    @Override
    public double area() {
        return getRectangularArea();
    }

    @Override
    public String printArea() {
        return "직사각형의 넓이는 " + area();
    }
}
