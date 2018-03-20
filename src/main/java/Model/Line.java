package Model;

import java.util.Arrays;

public class Line {

    private Point[] points = new Point[24];

    private Line(int x, int y){
        this.points[x] = Point.of(x, y);
    }

    public static Line of(int x, int y) {
        return new Line(x, y);
    }

    public Point get(int x){
        return this.points[x];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Arrays.equals(points, line.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }
}
