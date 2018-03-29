package saru.domain;

import java.util.*;

class Line {
    private Set<Point> userInput;

    Line(Set<Point> userInput) {
        this.userInput = userInput;
    }

    double calcLineLength() {
        Iterator iter = userInput.iterator();
        Point startPoint = (Point) iter.next();
        Point endPoint = (Point) iter.next();

        return startPoint.calcLengthWith(endPoint);
    }
}