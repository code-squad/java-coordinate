package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rectangle extends Figure {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int FOUR = 4;

    public Rectangle(List<Point> points) {
        super(points);
        check(points);
    }

    private void check(List<Point> points) {
        checkSize();
        int check = 0;
        for (Point point : points) {
            check += cntCoordinateValue(point, points);
        }
        checkRectangle(check);
    }

    @Override
    public void checkSize() {
        if (getPointsSize() != 4) {
            throw new IllegalArgumentException();
        }
    }

    private int cntCoordinateValue(Point point, List<Point> points) {
        int xCnt = 0;
        int yCnt = 0;
        for (Point other : points) {
            if (point.subtractXPoint(other) == ZERO) xCnt++;
            if (point.subtractYPoint(other) == ZERO) yCnt++;
        }
        if (xCnt == 2 && yCnt == 2) return ONE;
        return ZERO;
    }

    private void checkRectangle(int check) {
        if (check == FOUR) {
            return;
        }
        throw new IllegalArgumentException("사각형이 아닙니다");
    }

    @Override
    public double area() {
        List<Double> length = new ArrayList<>();
        for (int i = 0; i < getPointsSize() - 1; i++) {
            length.add(getPoint(i).calculateLength(getPoint(i + 1)));
        }
        Collections.sort(length);
        return (length.get(ZERO) * length.get(ONE));
    }
}