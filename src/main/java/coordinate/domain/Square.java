package coordinate.domain;

import coordinate.view.Output;

import java.util.List;


public class Square extends Figure {
    static final int SQUARE = 4;

    private Square(List<Point> points) {
        super(points);
    }

    public static Square ofSquare(List<Point> points) {
        return new Square(points);
    }

    public static boolean isSquare(List<Point> points) {
        return points.size() == SQUARE && isValid(points);
    }

    private static boolean isValid(List<Point> points) {
        for (Point point : points) {
            if (areTwoPointsPerRowOrColumn(points, point)) return true;
        }
        return false;
    }

    private static boolean areTwoPointsPerRowOrColumn(List<Point> points, Point point) {
        return point.arwTwoPointsPerRow(points) || point.areTwoPointsPerColumn(points);
    }


    double calculateHeight() {
        return calculateLength(FIRST, SECOND);
    }

    double calculateBase() {
        return calculateLength(FIRST, THIRD);
    }

    public double calculate() {
        Output.printMessage("사각형의 면적은: ");
        return calculateBase() * calculateHeight();
    }

    public boolean isMatch(int x, int y) {
        return points.stream().anyMatch(p -> p.xEquals(x) && p.yEquals(y));
    }
}