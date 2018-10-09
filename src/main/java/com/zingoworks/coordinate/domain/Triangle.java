package com.zingoworks.coordinate.domain;

import java.util.ArrayList;

public class Triangle extends Figure{
    private ArrayList<Point> points;

    public Triangle(ArrayList<Point> points){
        this.points = points;

        throwExceptionByNumberOfPoints(points);

        if(getArea() == 0) {
            throw new IllegalArgumentException("삼각형의 성립조건이 아닙니다.");
        }
    }

    @Override
    void throwExceptionByNumberOfPoints(ArrayList<Point> points) {
        if(points.size() != 3){
            throw new IllegalArgumentException("삼각형의 성립 조건이 아닙니다.");
        }
    }

    @Override
    public double getArea() {
        double a = this.points.get(0).getDistance(this.points.get(1));
        double b = this.points.get(1).getDistance(this.points.get(2));
        double c = this.points.get(0).getDistance(this.points.get(2));
        double s = (a+b+c) / 2;

        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
}
