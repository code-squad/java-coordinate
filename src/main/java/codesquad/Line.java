package codesquad;

public class Line {
    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public double length() {
        int xLength = end.lengthX(start);
        int yLength = end.lengthY(start);
        return Math.sqrt(square(xLength) + square(yLength));
    }

    private static long square(int number) {
        return number * number;
    }
}
