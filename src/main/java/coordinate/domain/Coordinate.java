package coordinate.domain;

public class Coordinate {
    private final boolean dot;

    private Coordinate(boolean dot) {
        this.dot = dot;
    }

    public static Coordinate ofPoint() {
        return new Coordinate(true);
    }

    public static Coordinate ofNoPoint() {
        return new Coordinate(false);
    }

    public boolean isDot() {
        return dot;
    }
}