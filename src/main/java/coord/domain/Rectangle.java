package coord.domain;

import java.util.List;

public class Rectangle extends Figure {

    Rectangle(List<Point> points, Point point) {
        super(points);
        points.add(point);
        validCheck();
    }

    private void validCheck() {
        Point benchmark = points.get(0);
        isDiagonalPointValid(benchmark.grepVertical(points), benchmark.grepHorizontal(points));
    }

    private void isDiagonalPointValid(Point vertical, Point horizontal) {
        for (Point point : points) {
            if (vertical.y == point.y && horizontal.x == point.x) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public double size() {
        Point benchmark = points.get(0);
        Point vertical = benchmark.grepVertical(points);
        Point horizontal = benchmark.grepHorizontal(points);
        return Math.abs((benchmark.x - horizontal.x) * (benchmark.y - vertical.y));
    }

    @Override
    public Figure addPoint(Point point) {
        return null;
    }

    @Override
    public String figureKind() {
        return "직사각형";
    }
}
