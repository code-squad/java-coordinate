package saru.domain;

import java.util.Set;

abstract class Figure {
    static final int INDEX_ONE = 0;
    static final int INDEX_TWO = 1;
    static final int INDEX_THREE = 2;
    static final int INDEX_FOUR = 3;

    Set<Point> userInput;

    abstract double area();

    abstract boolean checkValid();
}
