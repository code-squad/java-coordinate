package saru.domain;

import java.util.*;

public class Square extends Figure {
    public Square(Set<Point> userInput) {
        super(userInput);

        if (!checkValid()) {
            throw new IllegalArgumentException("스퀘어가 잘못됨");
        }
    }

    public double area() {
        double maxX = getMaxXValue();
        double minX = getMinXValue();
        double maxY = getMaxYValue();
        double minY = getMinYValue();

        return (maxX - minX) * (maxY - minY);
    }

    boolean checkValid() {
        return checkValidSquarePoint(getUserInputAsArrayList());
    }

    private boolean checkValidSquarePoint(List<Point> pointList) {
        double oneToTwo = Math.abs(pointList.get(INDEX_ONE).calcLengthWith(pointList.get(INDEX_TWO)));
        double threeToFour = Math.abs(pointList.get(INDEX_THREE).calcLengthWith(pointList.get(INDEX_FOUR)));
        double twoToThree = Math.abs(pointList.get(INDEX_TWO).calcLengthWith(pointList.get(INDEX_THREE)));
        double fourToOne = Math.abs(pointList.get(INDEX_FOUR).calcLengthWith(pointList.get(INDEX_ONE)));

        if (oneToTwo != threeToFour || twoToThree != fourToOne) {
            return false;
        }

        return true;
    }
}
