package domain;

public class Line {
    private Point a;
    private Point b;

    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Double getDistance() {
        return a.getDistance(b);
    }
}
