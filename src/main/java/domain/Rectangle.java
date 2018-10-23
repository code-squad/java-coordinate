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
        check(points);
        this.points = points;
    }

    private void check(List<Point> points) {
        checkSize(points);
        int check = 0;
        for (Point point : points) {
            check += cntCoordinateValue(0, 0, point, points);
        }
        checkRectangle(check);
    }

    private void checkSize(List<Point> points) {
        if (points.size() != 4) {
            throw new IllegalArgumentException();
        }
    }

    private int cntCoordinateValue(int xCnt, int yCnt, Point point, List<Point> points) {
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