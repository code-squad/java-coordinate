package com.zingoworks.coordinate.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Rectangle {
    private ArrayList<Integer> xValues;
    private ArrayList<Integer> yValues;

    public Rectangle(ArrayList<Point> point) {
        this.xValues = makeXvalues(point);
        this.yValues = makeYvalues(point);

        if(point.size() != 4){
            throw new IllegalArgumentException("사각형의 성립 조건이 아닙니다.");
        }

        if(getExceptionOfRectangle(xValues, yValues)){
            throw new IllegalArgumentException("직사각형의 성립 조건이 아닙니다.");
        }
    }

    private boolean getExceptionOfRectangle(ArrayList<Integer> xValues, ArrayList<Integer> yValues) {
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

    private ArrayList<Integer> makeXvalues(ArrayList<Point> point) {
        ArrayList<Integer> x = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            x.add(point.get(i).getX());
        }
        return x;
    }

    private ArrayList<Integer> makeYvalues(ArrayList<Point> point) {
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

    public int getAreaOfRectangle() {
        return findDistance(xValues) * findDistance(yValues);
    }
}
