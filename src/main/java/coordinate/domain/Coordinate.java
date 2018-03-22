package coordinate.domain;

public class Coordinate {
    private final boolean point;

    private Coordinate(boolean point) {
        this.point = point;
    }

    public static Coordinate ofPoint() {
        return new Coordinate(true);
    }

    public static Coordinate ofNoPoint() {
        return new Coordinate(false);
    }

    public boolean isPoint() {
        return point;
    }
}