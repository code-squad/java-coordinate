package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rectangle {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int FOUR = 4;

    private List<Point> points;

    public Rectangle(List<Point> points) {
        this.points = points;
        check();
    }

    private void check() {
        int xCnt = 0;
        int yCnt = 0;
        int check = 0;
        for (Point point : points) {
            check += cntCoordinateValue(xCnt, yCnt, point);
        }
        checkRectangle(check);
    }

    private int cntCoordinateValue(int xCnt, int yCnt, Point point) {
        for (Point other : points) {
            if (point.subtractXPoint(other) == ZERO) {
                xCnt++;
            }
            if (point.subtractYPoint(other) == ZERO) {
                yCnt++;
            }
        }
        if (xCnt == 2 && yCnt == 2) {
            return ONE;
        }
        return ZERO;
    }

    private void checkRectangle(int check) {
        if (check == FOUR) {
            return;
        }
        throw new IllegalArgumentException("사각형이 아닙니다");
    }

    public int calculateArea() {
        List<Double> length = new ArrayList<>();
        for (int i = 0; i < points.size() - 1; i++) {
            length.add(points.get(i).calculateLength(points.get(i + 1)));
        }
        Collections.sort(length);
        return (int) (length.get(ZERO) * length.get(ONE));
    }
}