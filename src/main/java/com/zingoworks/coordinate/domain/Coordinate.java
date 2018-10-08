package com.zingoworks.coordinate.domain;

import java.util.ArrayList;
import java.util.HashSet;

public class Coordinate {
    //인스턴스 변수 -> 클래스 변수로
    //불필요한 인스턴스 변수 지양
    private static ArrayList<Point> points = new ArrayList<>();

    public Coordinate(String[] input) {
        refinePoint(input);

        if(findSamePoints()) {
            throw new IllegalArgumentException("위치가 같은 점(point)이 존재합니다. 세 점의 위치는 달라야 합니다.");
        }
    }

    private boolean findSamePoints() {
        HashSet<Point> pointSets = new HashSet<>();
        for (Point point : points) {
            pointSets.add(point);
        }
        if (pointSets.size() != points.size()) {
            return true;
        }
        return false;
    }

    private void refinePoint(String[] input) {
//      포인트의 초기화 위치는 어디가 적절(?) 현재 케이스는 무방한가  points = new ArrayList<>();
//      points를 클래스 변수로가 아닌 이 메소드를 클래스 메소드로...?
        String[] refinedInput = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            refinedInput[i] = removeParentheses(input[i]);
            points.add(new Point(refinedInput[i]));
        }
    }

    public ArrayList<Point> getPoint() {
        return points;
    }

    private String removeParentheses(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.substring(1, sb.length() -1);
    }
}
