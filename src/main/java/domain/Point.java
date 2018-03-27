package domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point getPoint(int x, int y) {
        if ((x >= 0 && x < 25) && (y >= 0 && y < 25)) {
            return new Point(x, y);
        }
        return null;
    }

    public Double getDistance(Point otherPoint) {
        int aX = this.getX();
        int aY = this.getY();
        int bX = otherPoint.getX();
        int bY = otherPoint.getY();
        return Math.sqrt(Math.pow((aX - bX), 2) + Math.pow((aY - bY), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x : " + this.x + ", y : " + this.y;
    }
}
