package coordinate.domain;

public class Line {
    private Point point;
    private Point anotherPoint;

    public Line(Point point, Point anotherPoint) {
        this.point = point;
        this.anotherPoint = anotherPoint;
    }

    public double length(){
        return point.calculateLineLength(anotherPoint);
    }
}
