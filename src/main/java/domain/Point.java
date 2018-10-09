package domain;

import dto.PointDto;
import java.util.Objects;

public class Point {
    private Val x;
    private Val y;

    public Point(int x, int y) {
        this.x = new Val(x);
        this.y = new Val(y);
    }

    public PointDto makePointDto() {
        return new PointDto(x.getV(), y.getV());
    }

    public double calculateLineDistance(Point p) {
        return Math.sqrt(Math.pow(x.substract(p.x), 2) + Math.pow(y.substract(p.y), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) &&
                Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
