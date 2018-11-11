package coordinate.domain;

public class Point {
    public static final int MAX_SIZE = 24;
    private static final int MIN_SIZE = 0;
    public static final int TWO = 2;

    private int x;
    private int y;

    private Point(int x, int y) {
        this.x = sizeCheck(x);
        this.y = sizeCheck(y);
    }

    public static Point ofXY(int x, int y) {
        return new Point(x, y);
    }

    int sizeCheck(int num) throws RuntimeException {
        if (num > MAX_SIZE || num < MIN_SIZE) throw new RuntimeException();
        return num;
    }

    double getDistance(Point other) {
        return Math.sqrt(Math.pow((this.x - other.x), TWO) + Math.pow((this.y - other.y), TWO));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}


