package com.zingoworks.coordinate.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Rectangle extends Figure {
    private ArrayList<Integer> xValues;
    private ArrayList<Integer> yValues;

    public Rectangle(ArrayList<Point> points) {
        throwExceptionByNumberOfPoints(points);

        this.xValues = makeXvalues(points);
        this.yValues = makeYvalues(points);

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

    @Override
    void throwExceptionByNumberOfPoints(ArrayList<Point> point) {
        if(point.size() != 4){
            throw new IllegalArgumentException("사각형의 성립 조건이 아닙니다.");
        }
    }

    @Override
    //부모클래스의 추상메소드의 접근제어자와 다르게 설정 가능(?) weaker는 불가능(default -> private X, public O)
    public double getArea() {
        return findDistance(xValues) * findDistance(yValues);
    }
}
