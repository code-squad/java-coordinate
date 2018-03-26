package saru.domain;

import java.util.*;

public class Square {
    private static final int INDEX_ONE = 0;
    private static final int INDEX_TWO = 1;
    private static final int INDEX_THREE = 2;
    private static final int INDEX_FOUR = 3;
    private static final int SQUARE_POINT_NUM = 4;

    private Set<Point> userInput;

    public Square(Set<Point> userInput) {
        if (userInput.size() != SQUARE_POINT_NUM) {
            throw new IllegalArgumentException("스퀘어 포인트 수가 잘못됨");
        }

        this.userInput = userInput;
    }

    public double area() {
        if (!checkValidSquare()) {
            throw new IllegalArgumentException();
        }

        double maxX = SquareUtil.getMaxXValue(userInput);
        double minX = SquareUtil.getMinXValue(userInput);
        double maxY = SquareUtil.getMaxYValue(userInput);
        double minY = SquareUtil.getMinYValue(userInput);

        return (maxX - minX) * (maxY - minY);
    }

    private boolean checkValidSquare() {
        Iterator iter = userInput.iterator();
        Point[] pointArr = new Point[4];
        for (int i = 0; i < pointArr.length; i++) {
            pointArr[i] = (Point) iter.next();
        }

        return checkValidSquarePoint(pointArr);
    }

    private boolean checkValidSquarePoint(Point[] pointArr) {
        double oneToTwo = Math.abs(pointArr[INDEX_ONE].calcLengthWith(pointArr[INDEX_TWO]));
        double threeToFour = Math.abs(pointArr[INDEX_THREE].calcLengthWith(pointArr[INDEX_FOUR]));
        double twoToThree = Math.abs(pointArr[INDEX_TWO].calcLengthWith(pointArr[INDEX_THREE]));
        double fourToOne = Math.abs(pointArr[INDEX_FOUR].calcLengthWith(pointArr[INDEX_ONE]));

        if (oneToTwo != threeToFour || twoToThree != fourToOne) {
            return false;
        }

        return !checkPointAllEqual(pointArr);
    }

    private boolean checkPointAllEqual(Point[] pointArr) {
        return pointArr[INDEX_ONE].equals(pointArr[INDEX_TWO]) &&
                pointArr[INDEX_TWO].equals(pointArr[INDEX_THREE]) &&
                pointArr[INDEX_THREE].equals(pointArr[INDEX_FOUR]);
    }
}
