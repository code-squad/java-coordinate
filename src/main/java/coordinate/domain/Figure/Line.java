package coordinate.domain.Figure;

import coordinate.domain.Coordinate;
import coordinate.domain.Point;

import java.util.List;
import java.util.Objects;

public class Line extends AbstractFigure {
    private Line(List<Point> coordinate) {
        super(coordinate);
    }

    static Line ofCoordinate(List<Point> coordinate) {
        return new Line(coordinate);
    }

    @Override
    public int size() {
        return 2;
    }

    @Override
    public String getName() {
        return "선";
    }

    @Override
    public double getArea() {
        return coordinate.get(Coordinate.ZERO).getDistance(coordinate.get(Coordinate.ONE));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(coordinate, line.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate);
    }
}
