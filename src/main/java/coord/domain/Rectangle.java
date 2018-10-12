package coord.domain;

import java.util.List;

public class Rectangle extends Figure {

    Rectangle(List<Point> points) {
        super(points);
        validCheck();
    }

    private void validCheck() {
        Point benchmark = getPoint(0);
        isDiagonalPointValid(benchmark.grepVertical(getPointStream()),
                benchmark.grepHorizontal(getPointStream()));
    }

    private void isDiagonalPointValid(Point vertical, Point horizontal) {
        getPointStream()
                .filter(point -> vertical.x == point.x && horizontal.y == point.y)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public double area() {
        Point benchmark = getPoint(0);
        Point vertical = benchmark.grepVertical(getPointStream());
        Point horizontal = benchmark.grepHorizontal(getPointStream());
        return Math.abs((benchmark.x - horizontal.x) * (benchmark.y - vertical.y));
    }

    @Override
    public String figureKind() {
        return "직사각형";
    }
}
