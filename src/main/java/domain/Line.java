package domain;

public class Line {
    Point a;
    Point b;
    Double length;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Double getDistance() {
        int aX = a.getX();
        int aY = a.getY();
        int bX = b.getX();
        int bY = b.getY();
        this.length = Math.sqrt(Math.pow((aX - bX), 2) + Math.pow((aY - bY), 2));
        return this.length;
    }

    public Double getLength() {
        return length;
    }
}
