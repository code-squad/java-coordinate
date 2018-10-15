package domain;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double calcLength() {
        return Math.sqrt(Math.pow(p1.subtractXPoint(p2), 2) + Math.pow(p1.subtractYPoint(p2), 2));
    }
}