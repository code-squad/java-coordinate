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

    void draw() {
        isExist = true;
    }

    double calcLengthWith(Point endPoint) {
        double powX = Math.pow(x - endPoint.getX(), 2);
        double powY = Math.pow(x - endPoint.getY(), 2);
        return Math.sqrt(powX + powY);
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
}
