package saru.domain;

import java.util.*;

public class Square extends Figure {
    private static final int SQUARE_POINT_NUM = 4;

//    private Set<Point> userInput;

    public Square(Set<Point> userInput) {
        this.userInput = userInput;

        if (!checkValid()) {
            throw new IllegalArgumentException("스퀘어가 잘못됨");
        }
    }

    public double area() {
        double maxX = Util.getMaxXValue(userInput);
        double minX = Util.getMinXValue(userInput);
        double maxY = Util.getMaxYValue(userInput);
        double minY = Util.getMinYValue(userInput);

        return (maxX - minX) * (maxY - minY);
    }

    boolean checkValid() {
        return checkValidSquarePoint(new ArrayList<>(userInput));
    }

    private boolean checkValidSquarePoint(List<Point> pointList) {
        double oneToTwo = Math.abs(pointList.get(INDEX_ONE).calcLengthWith(pointList.get(INDEX_TWO)));
        double threeToFour = Math.abs(pointList.get(INDEX_THREE).calcLengthWith(pointList.get(INDEX_FOUR)));
        double twoToThree = Math.abs(pointList.get(INDEX_TWO).calcLengthWith(pointList.get(INDEX_THREE)));
        double fourToOne = Math.abs(pointList.get(INDEX_FOUR).calcLengthWith(pointList.get(INDEX_ONE)));

        if (oneToTwo != threeToFour || twoToThree != fourToOne) {
            return false;
        }

//        return !checkPointAllEqual(pointList);
        return true;
    }

    private boolean checkPointAllEqual(List<Point> pointList) {
        return pointList.get(INDEX_ONE).equals(pointList.get(INDEX_TWO)) &&
                pointList.get(INDEX_TWO).equals(pointList.get(INDEX_THREE)) &&
                pointList.get(INDEX_THREE).equals(pointList.get(INDEX_FOUR));
    }
}
