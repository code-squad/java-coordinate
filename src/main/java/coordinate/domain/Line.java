package coordinate.domain;

public class Line {
    private static final int SQUARE = 2;
    private Point point;
    private Point anotherPoint;

    public Line(Point point, Point anotherPoint) {
        this.point = point;
        this.anotherPoint = anotherPoint;
    }

    public double length(){
        return Math.sqrt(
                Math.pow(this.point.subX(this.anotherPoint), SQUARE)
                + Math.pow(this.point.subY(this.anotherPoint), SQUARE));
    }
}
