package coordinate;

import java.util.Objects;

public class Point {
    private PointNumber x;
    private PointNumber y;

//    public Point(PointNumber x, PointNumber y) {
//        this.x = x;
//        this.y = y;
//    }

    public Point(int x, int y) {
        this.x = new PointNumber(x);
        this.y = new PointNumber(y);
    }

    public double calculatorLength(Point point) {
        return Math.sqrt(Math.pow(this.x.getNumber() - point.x.getNumber(), 2) + Math.pow(this.y.getNumber() - point.y.getNumber(), 2));
    }

    public Boolean matchX(Point point) {
        return this.x == point.x;
    }

    public Boolean matchY(Point point) {
        return this.y == point.y;
    }

    public Boolean matchDot(int x, int y) {
        return this.x.getNumber() * 3 == x && this.y.getNumber() == y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
