package saru.domain;

import java.util.*;

public class Line {
    private Set<Point> userInput;

    Line(Set<Point> userInput) {
        if (userInput.size() != 2) {
            throw new IllegalArgumentException("라인의 포인트 수가 잘못됨");
        }

        this.userInput = userInput;
    }

    double calcLineLength() {
        Iterator iter = userInput.iterator();
        Point startPoint = (Point) iter.next();
        Point endPoint = (Point) iter.next();

        return startPoint.calcLengthWith(endPoint);
    }
}
