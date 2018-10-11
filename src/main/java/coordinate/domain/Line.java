package coordinate.domain;

public class Line implements Comparable<Line>{
    private Point point;
    private Point anotherPoint;

    public Line(Point point, Point anotherPoint) {
        this.point = point;
        this.anotherPoint = anotherPoint;
    }

    public double length(){
        return point.calculateLineLength(anotherPoint);
    }

    @Override
    public int compareTo(Line o) {
        if(this.length() > o.length()) return 1;
        if(this.length() < o.length()) return -1;
        return 0;
    }
}
