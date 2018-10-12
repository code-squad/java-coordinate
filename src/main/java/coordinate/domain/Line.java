package coordinate.domain;

import java.util.List;

public class Line extends Figure implements Comparable<Line>{
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final String NAME = "Line";

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double area() {
        return super.getPoint(ZERO).calculateLineLength(super.getPoint(ONE));
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int compareTo(Line o) {
        if(this.area() > o.area()) return ONE;
        if(this.area() < o.area()) return -ONE;
        return ZERO;
    }

    // just override. don't use.
    @Override
    protected boolean isValid() {
        return false;
    }
}
