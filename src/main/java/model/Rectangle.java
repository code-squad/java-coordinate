package model;

import java.util.List;

public class Rectangle extends AbstractFigures {
    private static final int FIRST_SIZE = 0;
    private static final int RECT_SIZE = 4;
    private List<Point> points;
    private Point pointFirst;

    public Rectangle(List<Point> points) {
        this.points = points;
        this.pointFirst = points.get(0);
    }

    public int minusX(int num) {
        if (num == FIRST_SIZE) {
            return pointFirst.minusXaxis(yNumber());
        }
        if (num > FIRST_SIZE && num < RECT_SIZE) {
            return points.get(num).minusXaxis(xNumber());
        }
        throw new IllegalArgumentException("직각 사각형으로 만들어주세요.");
    }

    // 예외처리
    public int minusY(int num) {
        if (num == FIRST_SIZE) {
            return pointFirst.minusYaxis(xNumber());
        }
        if (num > FIRST_SIZE && num < RECT_SIZE) {
            return points.get(num).minusYaxis(yNumber());
        }
        throw new IllegalArgumentException("직각 사각형으로 만들어주세요.");
    }

    public Point xNumber() {
        for (int i = 1; i < RECT_SIZE; i++) {
            if (pointFirst.isSameXaxis(points.get(i))) {
                return points.get(i);
            }
        }
        throw new IllegalArgumentException("y 축이 잘못 되었습니다.");
    }


    public Point yNumber() {
        for (int i = 1; i < RECT_SIZE; i++) {
            if (pointFirst.isSameYaxis(points.get(i))) {
                return points.get(i);
            }
        }
        throw new IllegalArgumentException("x 축이 잘못 되었습니다.");
    }

    public int square(int x, int y) {
        return pow(x) + pow(y);
    }

    public int differentFirst() {
        for (int i = 1; i < RECT_SIZE; i++) {
            if (pointFirst.isPassable(points.get(i))) {
                return i;
            }
        }
        throw new IllegalArgumentException("사각형이 아닙니다.");
    }

    public int diagonol() {
        int minusX = xNumber().minusXaxis(yNumber());
        int minusY = xNumber().minusYaxis(yNumber());
        return square(minusX, minusY);
    }

    public int extent(int num) {
        return square(minusX(num), minusY(num));
    }

    @Override
    public double getValue() {
        if (diagonol() != extent(FIRST_SIZE) || diagonol() != extent(differentFirst())) {
            throw new IllegalArgumentException("직각 사각형으로 만들어 주십시오.");
        }
        return diagonol();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "points=" + points +
                '}';
    }
}
