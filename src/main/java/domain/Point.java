package domain;

public class Point {
    public static final String DOT_IMAGE = "()";
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point otherPoint) {
        return Math.sqrt(Math.pow(otherPoint.getDifference(x, 'x'), 2) + Math.pow(otherPoint.getDifference(y, 'y'), 2));
    }

    private double getDifference(int num, char seperation)  {
        if(seperation == 'x') {
            return x - num;
        }
        return y - num;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
