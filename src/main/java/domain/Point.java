package domain;

import java.util.Comparator;

public class Point implements Comparable<Point> {
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

    protected double getGradient(Point otherPoint) {
        return Math.abs(otherPoint.getDifference(x, 'x')) / Math.abs(otherPoint.getDifference(y, 'y'));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point otherPoint) {
        if(this.x > otherPoint.getX()) return 1;
        else if (this.x < otherPoint.getX()) return -1;
        else return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
