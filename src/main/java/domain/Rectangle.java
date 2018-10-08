package domain;

import java.util.List;

public class Rectangle extends Figure {

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public double calc() {
        return getRectangularArea();
    }

    private Point searchSameYPoint(Point p) throws Exception {
        for (int i = 1; i < this.points.size(); i++) {
            if (p.isSameY(findIdx(i))) return findIdx(i);
        }
        throw new Exception();
    }

    private Point searchSameXPoint(Point p) throws Exception {
        for (int i = 1; i < this.points.size(); i++) {
            if (p.isSameX(findIdx(i))) return findIdx(i);
        }
        throw new Exception();
    }

    private int getRectangularArea() {
        try {
            Point p = findIdx(0);
            int horizontal = (int) p.getDistance(searchSameYPoint(p));
            int vertical = (int) p.getDistance(searchSameXPoint(p));

            return horizontal * vertical;
        } catch (Exception e) {
            return 0;
        }
    }
}
