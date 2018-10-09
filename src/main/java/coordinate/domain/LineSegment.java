package coordinate.domain;

public class LineSegment {
    private final Coordinate endPoint;
    private final Coordinate otherPoint;

    public LineSegment(Coordinate a, Coordinate b) {
        this.otherPoint = a;
        this.endPoint = b;
    }

    public double getDistance() {
        return Math.sqrt(Math.pow(otherPoint.subtractXCoordinateFrom(endPoint), 2) +
                Math.pow(otherPoint.subtractYCoordinateFrom(endPoint), 2));
    }
}
