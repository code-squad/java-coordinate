package domain;

import java.util.List;

public class Triangle extends Figure {

    Triangle(List<Point> points) {
        super(checkTriangle(checkSamePoint(points)));
    }

    private static List<Point> checkTriangle(List<Point> points) {
        Point tmp = points.get(0);

        for (int i = 1; i < points.size(); i++) {
            if (!tmp.isSameX(points.get(i)))
                return points;
        }

        throw new IllegalArgumentException("삼각형은 직선이 될 수 없습니다.");
    }

    private double getTriangleArea() {
        double a = findIdx(0).getDistance(findIdx(1));
        double b = findIdx(1).getDistance(findIdx(2));
        double c = findIdx(0).getDistance(findIdx(2));
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double area() {
        return getTriangleArea();
    }

    @Override
    public String printArea() {
        return "삼각형의 넓이는 " + area();
    }

}
