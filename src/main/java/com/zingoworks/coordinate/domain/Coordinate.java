package com.zingoworks.coordinate.domain;

import java.util.ArrayList;

public class Coordinate {
    //인스턴스 변수 -> 클래스 변수로
    //불필요한 인스턴스 변수 지양
    private static ArrayList<Point> point = new ArrayList<>();

    public Coordinate(String[] input) {
        refinePoint(input);
    }

    private void refinePoint(String[] input) {
//      포인트의 초기화 위치는 어디가 적절(?) 현재 케이스는 무방한가  point = new ArrayList<>();
        String[] refinedInput = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            refinedInput[i] = removeParentheses(input[i]);
            point.add(new Point(refinedInput[i]));
        }
    }

    public ArrayList<Point> getPoint() {
        return point;
    }

    private String removeParentheses(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.substring(1, sb.length() -1);
    }
}
