package coordinate.domain;

import java.util.List;

public class Line {
    private List<Point> coordinate;

    private Line(List<Point> coordinate) {
        this.coordinate = coordinate;
    }

    public static Line ofCoordinate(List<Point> coordinate) {
        return new Line(coordinate);
    }

    public float getLineLength() {
        return (float)coordinate.get(Coordinate.ZERO).getDistance(coordinate.get(Coordinate.ONE));
    }

}
