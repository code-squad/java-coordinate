package com.zingoworks.coordinate.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Rectangle extends Figure {
    private List<Integer> xValues;
    private List<Integer> yValues;

    public Rectangle(List<Point> points) {
        super(4, "사각형의 성립조건이 아닙니다.");

        throwExceptionByNumberOfPoints(points);

        this.xValues = makeXvalues(points);
        this.yValues = makeYvalues(points);

        if(getExceptionOfRectangle(xValues, yValues)){
            throw new IllegalArgumentException("직사각형의 성립 조건이 아닙니다.");
        }
    }

    private boolean getExceptionOfRectangle(List<Integer> xValues, List<Integer> yValues) {
        if (setHashSet(xValues).size() != 2 || setHashSet(yValues).size() != 2) {
            return true;
        }
        return false;
    }

    private HashSet<Integer> setHashSet(List<Integer> coordinateValues) {
        HashSet<Integer> n = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            n.add(coordinateValues.get(i));
        }
        return n;
    }

    private List<Integer> makeXvalues(List<Point> point) {
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            x.add(point.get(i).getX());
        }
        return x;
    }

    private List<Integer> makeYvalues(List<Point> point) {
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            y.add(point.get(i).getY());
        }
        return y;
    }

    private int findDistance(List<Integer> values) {
        int max = Collections.max(values);
        int min = Collections.min(values);
        return max - min;
    }

    @Override
    public String getFigure() {
        return "사각형";
    }

    @Override
    public double getArea() {
        return findDistance(xValues) * findDistance(yValues);
    }
}
