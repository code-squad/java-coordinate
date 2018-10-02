package domain;

import dto.PointDto;

import java.util.Objects;

public class Point {

    private int x;
    private int y;

    private Point(int y) {
        this.x = -1;
        this.y = y;
    }

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point init(PointDto dto) {
        return new Point(dto.getX(), dto.getY());
    }

    public static Point initNone(int y) {
        return new Point(y);
    }

    public PointDto toDto() {
        return new PointDto(this.x, this.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
