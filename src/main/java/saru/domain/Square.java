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
        double oneToTwo = calcValueWith(INDEX_ONE, INDEX_TWO);
        double threeToFour = calcValueWith(INDEX_THREE, INDEX_FOUR);
        double twoToThree = calcValueWith(INDEX_TWO, INDEX_THREE);
        double fourToOne = calcValueWith(INDEX_FOUR, INDEX_ONE);

        return !(oneToTwo != threeToFour) && !(twoToThree != fourToOne);
    }
}
