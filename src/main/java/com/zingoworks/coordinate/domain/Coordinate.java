package com.zingoworks.coordinate.domain;

import java.util.ArrayList;

public class Coordinate {
    private ArrayList<Point> point;

    public Coordinate(String[] input) {
        this.point = savePoint(input);
    }

    private ArrayList<Point> savePoint(String[] input) {
        ArrayList<Point> initPoint = new ArrayList<>();
        String[] refinedInput = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            refinedInput[i] = removeParentheses(input[i]);
            initPoint.add(new Point(refinedInput[i]));
        }
        return initPoint;
    }

    public ArrayList<Point> getPoint() {
        return point;
    }

    private String removeParentheses(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.substring(1, sb.length() -1);
    }
}
