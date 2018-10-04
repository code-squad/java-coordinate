package com.zingoworks.coordinate.domain;

import java.util.ArrayList;

import static com.zingoworks.coordinate.CoordinateMain.LENGTH_X;
import static com.zingoworks.coordinate.CoordinateMain.LENGTH_Y;

public class Coordinate {
    private static final char MARKER = '·';

    private ArrayList<StringBuilder> markingPoint = new ArrayList<>();
    private ArrayList<Point> point = new ArrayList<>();

    public Coordinate(String[] input) {
        refinePoint(input);
        generateMarkedCoordinatePlane();
    }

    public ArrayList<StringBuilder> getMarkingPoint() {
        return markingPoint;
    }

    public ArrayList<Point> getPoint() {
        return point;
    }

    private void refinePoint(String[] input) {
        String[] refinedInput = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            refinedInput[i] = removeParentheses(input[i]);
            point.add(new Point(refinedInput[i]));
        }
    }

    private String removeParentheses(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.substring(1, sb.length() -1);
    }

    private void generateMarkedCoordinatePlane() {
        generateBlankCoordinatePlane();
        pointMark();
    }

    private void generateBlankCoordinatePlane() {
        for (int i = 0; i < LENGTH_Y; i++) {
            markingPoint.add(new StringBuilder());
            generateBlankCoordinatePlaneByX(i);
        }
    }

    private void generateBlankCoordinatePlaneByX(int i) {
        for (int j = 0; j < LENGTH_X * 2; j++) {
            markingPoint.get(i).append(" ");
        }
    }

    private void pointMark() {
        for (int i = 0; i < point.size(); i++) {
            markingPoint.get(point.get(i).getY() - 1).setCharAt(point.get(i).getX() * 2 - 1, MARKER);
        }
    }
}
