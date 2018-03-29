package saru.domain;

import java.util.*;

public class Triangle extends Figure{
    public Triangle(Set<Point> userInput) {
        super(userInput);

        if (!checkValid()) {
            throw new IllegalArgumentException("트라이앵글이 잘못됨");
        }
    }

    public double area() {
        // 헤론의 공식
        double a = calcValueWith(INDEX_ONE, INDEX_TWO);
        double b = calcValueWith(INDEX_TWO, INDEX_THREE);
        double c = calcValueWith(INDEX_THREE, INDEX_ONE);

        return heronMethod(a, b, c);
    }

    private double heronMethod(double a, double b, double c) {
        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public boolean checkValid() {
        return !checkAllSameX() && !checkAllSameY();
    }

    private boolean checkAllSameY() {
        return checkSameY(INDEX_ONE, INDEX_TWO) && checkSameY(INDEX_TWO, INDEX_THREE);
    }

    private boolean checkAllSameX() {
        return checkSameX(INDEX_ONE, INDEX_TWO) && checkSameX(INDEX_TWO, INDEX_THREE);
    }
}