package domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Point {
    int x;
    int y;

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

    // todo 현재 포인트와 입력받은 포인트와의 거리
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

    public static Comparator<Point> descSort = new Comparator<Point>() {
        @Override
        public int compare(Point o1, Point o2) {
            Integer o1Y = o1.getY();
            Integer o2Y = o2.getY();
            int compareResult = o1Y.compareTo(o2Y);

            if (compareResult != 0) {
                return compareResult * -1; // 기본값에 -1을 곱하면 descending
            }

            Integer o1X = o1.getX();
            Integer o2X = o2.getX();
            compareResult = o1X.compareTo(o2X);
            return compareResult * -1;
        }
    };
}
