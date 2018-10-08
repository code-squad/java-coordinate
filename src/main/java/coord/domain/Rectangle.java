package coord.domain;

import java.util.List;

public class Rectangle extends Figure {

    Rectangle(List<Point> points, Point point) {
        this.points = points;
        points.add(point);
        validCheck();
    }

    private void validCheck() {
        Point benchmark = points.get(0);
        isDiagonalPointValid(verticalOf(benchmark), horizontalOf(benchmark));
    }

    private Point verticalOf(Point benchmark) {
        for (Point point : points) {
            if (benchmark.x == point.x && benchmark.y != point.y) {
                return point;
            }
        }
        throw new IllegalArgumentException();
    }

    private Point horizontalOf(Point benchmark) {
        for (Point point : points) {
            if (benchmark.y == point.y && benchmark.x != point.x) {
                return point;
            }
        }
        throw new IllegalArgumentException();
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
        Point vertical = verticalOf(benchmark);
        Point horizontal = horizontalOf(benchmark);
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
