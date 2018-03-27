package coordinate.domain;

import coordinate.view.Output;

import java.util.List;

import static coordinate.domain.Utils.FIRST;
import static coordinate.domain.Utils.SECOND;
import static coordinate.domain.Utils.THIRD;

public class Square extends Figure {
    static final int SQUARE = 4;

    private Square(List<Point> points) {
        super(points);
    }

    public static Square ofSquare(List<Point> points) {
        return new Square(points);
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

    public static boolean isSquare(Figure figure) {
        return figure.points.size() == SQUARE && isValid(figure.points);
    }

    private static boolean isValid(List<Point> points) {
        for (Point point : points) {
            if (areTwoPointsPerRowOrColumn(points, point)) return true;
        }
        return false;
    }
}