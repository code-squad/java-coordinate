package saru.domain;

import java.util.*;

public class Triangle {
    private static final int INDEX_ONE = 0;
    private static final int INDEX_TWO = 1;
    private static final int INDEX_THREE = 2;
    private static final int TRIANGLE_POINT_NUM = 3;

    private Set<Point> userInput;

    public Triangle(Set<Point> userInput) {
        if (userInput.size() != TRIANGLE_POINT_NUM) {
            throw new IllegalArgumentException("트라이앵글 포인트 수가 잘못됨");
        }

        this.userInput = userInput;
    }

    public double area() {
        if (!checkValidTriangle()) {
            throw new IllegalArgumentException();
        }

        Iterator iter = userInput.iterator();
        Point[] pointArr = new Point[TRIANGLE_POINT_NUM];
        for (int i = 0; i < pointArr.length; i++) {
            pointArr[i] = (Point) iter.next();
        }

        // 헤론의 공식
        double a = pointArr[INDEX_ONE].calcLengthWith(pointArr[INDEX_TWO]);
        double b = pointArr[INDEX_TWO].calcLengthWith(pointArr[INDEX_THREE]);
        double c = pointArr[INDEX_THREE].calcLengthWith(pointArr[INDEX_ONE]);

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private boolean checkValidTriangle() {
        Iterator iter = userInput.iterator();
        Point[] pointArr = new Point[TRIANGLE_POINT_NUM];
        for (int i = 0; i < pointArr.length; i++) {
            pointArr[i] = (Point) iter.next();
        }

        if (checkAllSameX(pointArr) || checkAllSameY(pointArr))
            return false;

        return checkValidTrianglePoint(pointArr);
    }

    private boolean checkAllSameY(Point[] pointArr) {
        if (pointArr[INDEX_ONE].checkSameY(pointArr[INDEX_TWO]) &&
                pointArr[INDEX_TWO].checkSameY(pointArr[INDEX_THREE])) {
            return true;
        }
        return false;
    }

    private boolean checkAllSameX(Point[] pointArr) {
        if (pointArr[INDEX_ONE].checkSameX(pointArr[INDEX_TWO]) &&
                pointArr[INDEX_TWO].checkSameX(pointArr[INDEX_THREE])) {
            return true;
        }
        return false;
    }

    private boolean checkValidTrianglePoint(Point[] pointArr) {
        if (pointArr[INDEX_ONE].equals(pointArr[INDEX_TWO]) &&
                pointArr[INDEX_TWO].equals(pointArr[INDEX_THREE])) {
            return false;
        }

        return true;
    }
}
