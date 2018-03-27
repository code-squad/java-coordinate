package coordinate.domain;

import java.util.List;

import static coordinate.domain.Utils.FIRST;
import static coordinate.domain.Utils.SECOND;
import static coordinate.domain.Utils.THIRD;

public class Triangle extends Figure {
    static final int TRIANGLE = 3;

    private Triangle(List<Point> points) {
        super(points);
    }

    public static Triangle ofTriangle(List<Point> points) {
        return new Triangle(points);
    }

    public double calculate() {
        double a = calculateLength(FIRST, SECOND);
        double b = calculateLength(FIRST, THIRD);
        double c = calculateLength(SECOND, THIRD);
        double p = calculateParameter(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double calculateParameter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean isMatch(int x, int y) {
        return points.stream().anyMatch(point -> point.xEquals(x) && point.yEquals(y));
    }

    public static boolean isTriangle(Figure figure) {
        return figure.points.size() == TRIANGLE;
    }
}