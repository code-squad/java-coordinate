package saru.domain;

import java.util.*;

public class Line {
    private static final int START_INDEX = 0;
    private static final int END_INDEX = 1;

    private List<Point> userInput;

    Line(List<Point> userInput) {
        this.userInput = userInput;
    }

    double calcLineLength() {
        return userInput.get(START_INDEX).calcLengthWith(userInput.get(END_INDEX));
    }
}
