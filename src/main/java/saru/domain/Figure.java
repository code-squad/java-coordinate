package saru.domain;

import java.util.*;

abstract class Figure {
    static final int INDEX_ONE = 0;
    static final int INDEX_TWO = 1;
    static final int INDEX_THREE = 2;
    static final int INDEX_FOUR = 3;

    private Set<Point> userInput;

    Figure(Set<Point> userInput) {
        this.userInput = userInput;
    }

    private List<Point> getUserInputAsArrayList() {
        return new ArrayList<>(userInput);
    }

    boolean checkSameX(int first, int second) {
        List<Point> userInputList = getUserInputAsArrayList();
        return userInputList.get(first).checkSameX(userInputList.get(second));
    }

    boolean checkSameY(int first, int second) {
        List<Point> userInputList = getUserInputAsArrayList();
        return userInputList.get(first).checkSameY(userInputList.get(second));
    }

    double calcValueWith(int first, int second) {
        List<Point> userInputList = getUserInputAsArrayList();
        return Math.abs(userInputList.get(first).calcLengthWith(userInputList.get(second)));
    }

    double getMaxXValue() {
        return Util.getMaxXValue(userInput);
    }

    double getMaxYValue() {
        return Util.getMaxYValue(userInput);
    }

    double getMinXValue() {
        return Util.getMinXValue(userInput);
    }

    double getMinYValue() {
        return Util.getMinYValue(userInput);
    }

    abstract double area();

    abstract boolean checkValid();
}
