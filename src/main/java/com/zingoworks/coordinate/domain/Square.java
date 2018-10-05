package com.zingoworks.coordinate.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Square {
    private ArrayList<Integer> xValues = new ArrayList<>();
    private ArrayList<Integer> yValues = new ArrayList<>();
//coordinate에서 point를 꺼내서
    public Square(ArrayList<Point> point) {
        setValues(coordinate);

        if(coordinate.getPoint().size() != 4) {
            throw new IllegalArgumentException("사각형의 성립 조건이 아닙니다.");
        }
        if(getExceptionOfRectangular()){
            throw new IllegalStateException("직사각형의 성립 조건이 아닙니다.");
        }
    }

    private boolean getExceptionOfRectangular() {
        HashSet<Integer> x = new HashSet<>();
        HashSet<Integer> y = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            x.add(xValues.get(i));
            y.add(yValues.get(i));
        }

        if (x.size() != 2 || y.size() != 2) {
            return true;
        }
        return false;
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
