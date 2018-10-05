package com.zingoworks.coordinate.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Square {
    private ArrayList<Integer> xValues;
    private ArrayList<Integer> yValues;

    public Square(ArrayList<Point> point) {
        this.xValues = xValues(point);
        this.yValues = yValues(point);

        if(point.size() != 4){
            throw new IllegalArgumentException("사각형의 성립 조건이 아닙니다.");
        }

        if(getExceptionOfRectangular(xValues, yValues)){
            throw new IllegalStateException("직사각형의 성립 조건이 아닙니다.");
        }
    }

    private boolean getExceptionOfRectangular(ArrayList<Integer> xValues, ArrayList<Integer> yValues) {
        if (setHashSet(xValues).size() != 2 || setHashSet(yValues).size() != 2) {
            return true;
        }
        return false;
    }

    private HashSet<Integer> setHashSet(ArrayList<Integer> coordinateValues) {
        HashSet<Integer> n = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            n.add(coordinateValues.get(i));
        }
        return n;
    }

    private ArrayList<Integer> xValues(ArrayList<Point> point) {
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            x.add(point.get(i).getX());
        }
        return x;
    }

    private ArrayList<Integer> yValues(ArrayList<Point> point) {
        ArrayList<Integer> y = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            y.add(point.get(i).getY());
        }
        return y;
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
