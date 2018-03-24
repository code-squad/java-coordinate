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
        Line line = new Line(this, otherPoint);
        return line.getLength();
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

    public static Comparator<Integer> descSort = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if( o1 > o2 ) {
                return -1;
            }
            if( o1 < o2 ) {
                return 1;
            }
            return 0;
        }
    };
}
