package saru.domain;

public class Point {
    private static final int MAX_VALUE = 24;
    private static final String INVALID_X_POSITION = "올바르지 못한 x 좌표 입력";
    private static final String INVALID_Y_POSITION = "올바르지 못한 y 좌표 입력";

    private double x;
    private double y;
    private boolean isExist;

    public Point(double x, double y) {
        this(x, y, false);
    }

    public Point(double x, double y, boolean isExist) {
        if (x < 0 || x > MAX_VALUE) {
            throw new IllegalArgumentException(INVALID_X_POSITION);
        }

        if (y < 0 || y > MAX_VALUE) {
            throw new IllegalArgumentException(INVALID_Y_POSITION);
        }

        this.x = x;
        this.y = y;
        this.isExist = isExist;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isExist() {
        return isExist;
    }

    boolean hasX(double x) {
        if (this.x == x) {
            return true;
        }

        return false;
    }

    void draw() {
        isExist = true;
    }

    double calcLengthWith(Point endPoint) {
        double powX = Math.pow(x - endPoint.getX(), 2);
        double powY = Math.pow(x - endPoint.getY(), 2);
        return Math.sqrt(powX + powY);
    }
}
