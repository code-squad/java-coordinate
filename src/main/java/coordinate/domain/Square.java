package coordinate.domain;

import coordinate.view.Output;

import java.util.List;

public class Square extends Figure {
    private final List<Point> points;

    private Square(List<Point> points) {
        this.points = points;
    }

    public static Square ofSquare(List<Point> points) throws IllegalArgumentException {
        if (isInvalid(points)) {
            throw new IllegalArgumentException();
        }
        if (Utils.isDuplicate(points)) {
            Output.printMessage("중복되는 좌표가 있습니다. 네 점의 위치는 달라야 합니다.");
            throw new IllegalArgumentException();
        }
        return new Square(points);
    }

    private static boolean isInvalid(List<Point> points) {
        for (Point point : points) {
            if (!areTwoPointsPerRowOrColumn(points, point)) return true;
        }
        return false;
    }

    private static boolean areTwoPointsPerRowOrColumn(List<Point> points, Point point) {
        return point.arwTwoPointsPerRow(points) || point.areTwoPointsPerColumn(points);
    }


    double calculateHeight() {
        List<Point> twoPoints = points.get(FIRST).getPointsOnSameColumn(points);
        return Figure.calculateLength(twoPoints);
    }

    double calculateBase() {
        List<Point> twoPoints = points.get(FIRST).getPointsOnSameRow(points);
        return Figure.calculateLength(twoPoints);
    }

    public double calculate() {
        Output.printMessage("사각형의 면적은: ");
        return calculateBase() * calculateHeight();
    }

    public boolean isMatch(int x, int y) {
        return points.stream().anyMatch(p -> p.xEquals(x) && p.yEquals(y));
    }
}