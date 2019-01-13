package coordinates.domain;

public class Line {
    private Point point;
    private Point distinctPoint;

    public Line(Point point, Point distinctPoint){
        this.point = point;
        this.distinctPoint = distinctPoint;
    }

    public double mathPoint(){
        return point.getMath(distinctPoint);
    }

    public double area(Line line){
        return line.mathPoint() * mathPoint();
    }
}
