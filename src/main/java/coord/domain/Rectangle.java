package coord.domain;

import java.util.List;

public class Rectangle extends Figure {

    Rectangle(List<Point> points) {
        super(points);
        validCheck();
    }

    private void validCheck() {
        Point benchmark = getPoints().get(0);
        isDiagonalPointValid(benchmark.grepVertical(getPoints()), benchmark.grepHorizontal(getPoints()));
    }

    private void isDiagonalPointValid(Point vertical, Point horizontal) {
        for (Point point : getPoints()) {
            if (vertical.y == point.y && horizontal.x == point.x) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public double area() {
        Point benchmark = getPoints().get(0);
        Point vertical = benchmark.grepVertical(getPoints());
        Point horizontal = benchmark.grepHorizontal(getPoints());
        return Math.abs((benchmark.x - horizontal.x) * (benchmark.y - vertical.y));
    }

    @Override
    public String figureKind() {
        return "직사각형";
    }
}
