package coordinate.domain;

public class Coordinate {
    private final boolean point;
    private final int x;
    private final int y;

    private Coordinate(boolean point, int x, int y) {
        this.x = x;
        this.y = y;
        this.point = point;
    }

    public static Coordinate ofPoint(int x, int y) {
        return new Coordinate(true, x, y);
    }

    public static Coordinate ofNoPoint(int x, int y) {
        return new Coordinate(false, x, y);
    }

    public boolean yIsEven(){
        return y % 2 == 0;
    }

    public boolean isOnYAxis() {
        return x == 0;
    }

    public boolean isOnXAxis() {
        return y == 0;
    }

    public boolean isPoint() {
        return point;
    }
}