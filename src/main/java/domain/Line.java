package domain;

import java.util.ArrayList;

public class Line extends Shape {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        lineCount = 1;
        this.a = a;
        this.b = b;
    }

    public Line(ArrayList<Point> points) {
        this(points.get(0), points.get(1));
    }

    public Double getDistance() {
        return a.getDistance(b);
    }

    // y축의 좌표가 같은 라인
    public Boolean isWidth() {
        if (this.a.getY() == this.b.getY()) {
            return true;
        }
        return false;
    }

    // x축의 좌표가 같은 라인
    public Boolean isHeight() {
        if (this.a.getX() == this.b.getX()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "(" + this.a.getX() + ", " + this.a.getY() + ")" +
                "(" + this.b.getX() + ", " + this.b.getY() + ")";
    }
}
