package saru.domain;

public class Point {
    private double x;
    private double y;
    private boolean isExist;

    public Point(double x, double y, boolean isExist) {
        this.x = x;
        this.y = y;
        this.isExist = isExist;
    }

    boolean hasX(double x) {
        if (this.x == x) {
            return true;
        }

        return false;
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

    void draw() {
        isExist = true;
    }

    void erase() {
        isExist = false;
    }
}
