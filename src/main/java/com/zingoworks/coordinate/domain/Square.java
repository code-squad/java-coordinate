package com.zingoworks.coordinate.domain;

import java.util.ArrayList;
import java.util.Collections;

public class Square {
    private ArrayList<Integer> xValues = new ArrayList<>();
    private ArrayList<Integer> yValues = new ArrayList<>();

    public Square(Coordinate coordinate) {
        if(coordinate.getPoint().size() != 4) {
            throw new IllegalArgumentException("사각형의 성립 조건이 아닙니다.");
        }
        setValues(coordinate);
    }

    private void setValues(Coordinate coordinate) {
        for (int i = 0; i < 4; i++) {
            this.xValues.add(coordinate.getPoint().get(i).getX());
            this.yValues.add(coordinate.getPoint().get(i).getY());
        }
    }

    private int findDistance(ArrayList<Integer> values) {
        int max = Collections.max(values);
        int min = Collections.min(values);
        return max - min;
    }

    public int getAreaOfSquare() {
        return findDistance(xValues) * findDistance(yValues);
    }
}
