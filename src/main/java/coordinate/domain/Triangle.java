package coordinate.domain;

import coordinate.view.Output;

import java.util.List;

public class Triangle extends Figure {
    private static final int THIRD = 3;
    private final List<Point> points;

    private Triangle(List<Point> points) {
        this.points = points;
    }

    public static Triangle ofTriangle(List<Point> points) throws IllegalArgumentException {
        if (Utils.isDuplicate(points)) {
            Output.printMessage("중복되는 좌표가 있습니다. 세 점의 위치는 달라야 합니다.");
            throw new IllegalArgumentException();
        }
        return new Triangle(points);
    }

    public double calculate() {
        double a = Figure.calculateLength(points.subList(FIRST, SECOND));
        double b = Figure.calculateLength(points.subList(FIRST, THIRD));
        double c = Figure.calculateLength(points.subList(SECOND, THIRD));
        double p = calculateParameter(a, b, c);
        Output.printMessage("삼각형의 면적은: ");
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    private double calculateParameter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public boolean isMatch(int x, int y) {
        return points.stream().anyMatch(point -> point.xEquals(x) && point.yEquals(y));
    }
}