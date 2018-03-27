package saru.domain;

import java.util.*;

public class Square extends Figure {
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

        return true;
    }
}
