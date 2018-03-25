package saru.domain;

import java.util.*;

public class Line {
    private static final int START_INDEX = 0;
    private static final int END_INDEX = 1;

    private List<Point> userInput;

    Line(List<Point> userInput) {
        if (userInput.size() != 2) {
            throw new IllegalArgumentException("라인의 포인트 수가 잘못됨");
        }

        this.userInput = userInput;
    }

    double calcLineLength() {
        return userInput.get(START_INDEX).calcLengthWith(userInput.get(END_INDEX));
    }
}
