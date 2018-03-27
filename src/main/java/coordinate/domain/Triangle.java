package coordinate.domain;

import coordinate.view.Output;
import sun.awt.util.IdentityLinkedList;

import java.util.List;

public class Triangle extends Figure {
    private static final int TRIANGLE = 3;
    private static final int FIRST = 0;
    private static final int SECOND = 1;
    private static final int THIRD = 2;
    private final List<Point> points;

    private Triangle(List<Point> points) {
        this.points = points;
    }

    public static Triangle ofTrianle(List<Point> points) throws IllegalArgumentException {
        if (!isTriangle(points)) {
            throw new IllegalArgumentException();
        }
        if (Utils.isDuplicate(points)) {
            Output.printMessage("중복되는 좌표가 있습니다. 세 점의 위치는 달라야 합니다.");
            throw new IllegalArgumentException();
        }
        return new Triangle(points);
    }

    public static boolean isTriangle(List<Point> points) throws IllegalArgumentException {
        return points.size() == TRIANGLE;
    }

    public double calculate() {
        double a = points.get(FIRST).calculateDistanceFrom(points.get(SECOND));
        double b = points.get(FIRST).calculateDistanceFrom(points.get(THIRD));
        double c = points.get(SECOND).calculateDistanceFrom(points.get(THIRD));

        double p = calculateParameter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double calculateParameter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean isMatch(int x, int y) {
        return points.stream().anyMatch(point -> point.xEquals(x) && point.yEquals(y));
    }
}