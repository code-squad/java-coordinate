package com.zingoworks.coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;

public class Coordinate {
    public static ArrayList<Point> getRefinedPoint(String[] input) {
        ArrayList<Point> points = new ArrayList<>();
        String[] refinedInput = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            refinedInput[i] = removeParentheses(input[i]);
            points.add(new Point(refinedInput[i]));
        }

        if(findOverlappedPoints(points)) {
            throw new IllegalArgumentException("위치가 같은 점(point)이 존재합니다. 세 점의 위치는 달라야 합니다.");
        }

        return points;
    }

    private static boolean findOverlappedPoints(ArrayList<Point> points) {
        HashSet<Point> pointSets = new HashSet<>();
        for (Point point : points) {
            pointSets.add(point);
        }
        if (pointSets.size() != points.size()) {
            return true;
        }
        return false;
    }

    private static String removeParentheses(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.substring(1, sb.length() -1);
    }
}
