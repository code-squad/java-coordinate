package saru.domain;

import java.util.*;

public class Triangle extends Figure {
    private static final int TRIANGLE_POINT_NUM = 3;

//    private Set<Point> userInput;

    public Triangle(Set<Point> userInput) {
        this.userInput = userInput;

        if (!checkValid()) {
            throw new IllegalArgumentException("트라이앵글이 잘못됨");
        }
    }

    public double area() {
        List<Point> pointList = new ArrayList<>(userInput);

        // 헤론의 공식
        double a = pointList.get(INDEX_ONE).calcLengthWith(pointList.get(INDEX_TWO));
        double b = pointList.get(INDEX_TWO).calcLengthWith(pointList.get(INDEX_THREE));
        double c = pointList.get(INDEX_THREE).calcLengthWith(pointList.get(INDEX_ONE));

        return heronMethod(a, b, c);
    }

    private double heronMethod(double a, double b, double c) {
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    boolean checkValid() {
        List<Point> pointList = new ArrayList<>(userInput);

        if (checkAllSameX(pointList) || checkAllSameY(pointList))
            return false;

//        return checkValidTrianglePoint(pointList);
        return true;
    }

    private boolean checkAllSameY(List<Point> pointList) {
        if (pointList.get(INDEX_ONE).checkSameY(pointList.get(INDEX_TWO)) &&
                pointList.get(INDEX_TWO).checkSameY(pointList.get(INDEX_THREE))) {
            return true;
        }
        return false;
    }

    private boolean checkAllSameX(List<Point> pointList) {
        if (pointList.get(INDEX_ONE).checkSameX(pointList.get(INDEX_TWO)) &&
                pointList.get(INDEX_TWO).checkSameX(pointList.get(INDEX_THREE))) {
            return true;
        }
        return false;
    }

    private boolean checkValidTrianglePoint(List<Point> pointList) {
        if (pointList.get(INDEX_ONE).equals(pointList.get(INDEX_TWO)) &&
                pointList.get(INDEX_TWO).equals(pointList.get(INDEX_THREE))) {
            return false;
        }

        return true;
    }
}
