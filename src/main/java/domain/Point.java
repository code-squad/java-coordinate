package domain;

import dto.PointDto;

import java.util.List;
import java.util.Objects;

public class Point {
    private Val x;
    private Val y;

    public Point(double x, double y) {
        this.x = new Val(x);
        this.y = new Val(y);
    }

    public PointDto makePointDto() {
        return new PointDto((int)x.getV(), (int)y.getV());
    }

    public double calculateLength(Point p) {
        return Math.sqrt(Math.pow(x.substract(p.x), 2) + Math.pow(y.substract(p.y), 2));
    }

    public static Point calculatePointsAverage(List<Point> points) {
        int pointSize = points.size();
        double middleX = 0, middleY = 0;
        for (Point point : points) {
            middleX += point.x.getV();
            middleY += point.y.getV();
        }
        return new Point(middleX / pointSize, middleY / pointSize);
    }

    

    @Override
    public String toString() {
        return "Points{" +
                "x=" + x +
                ", y=" + y +
                '}';
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
