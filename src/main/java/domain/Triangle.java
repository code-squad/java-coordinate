package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triangle extends Figure {

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public double calc() {
        if (checkOverlap(this.points) && checkLine(this.points))
            return getTriangleArea(this.points);
        return 0;
    }

    private double getTriangleArea(List<Point> points) {
        double a = findIdx(0).getDistance(findIdx(1));
        double b = findIdx(1).getDistance(findIdx(2));
        double c = findIdx(0).getDistance(findIdx(2));
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // 직선 검사
    private Boolean checkLine(List<Point> points) {
        Point tmp = findIdx(0);

        for (int i = 1; i < points.size(); i++) {
            if (!tmp.isSameX(findIdx(i)))
                return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    // 중복 검사
    private Boolean checkOverlap(List<Point> points) {
        Set<Point> tmp = new HashSet<>(points);
        return tmp.size() == points.size();
    }

}
