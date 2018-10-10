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
    public boolean equals(Object obj) {
        Point other = (Point) obj;
        return this.x == other.getX() && this.y == other.getY();
    }
}
