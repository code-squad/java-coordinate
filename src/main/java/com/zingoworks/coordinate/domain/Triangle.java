package com.zingoworks.coordinate.domain;

import java.util.ArrayList;

public class Triangle {
    private ArrayList<Point> point;

    public Triangle(ArrayList<Point> point){
        this.point = point;

        if (point.size() != 3) {
            throw new IllegalArgumentException("삼각형의 성립조건이 아닙니다.");
        }

        if(getAreaOfTriangle() == 0) {
            throw new IllegalArgumentException("삼각형의 성립조건이 아닙니다.");
        }
    }

    public double getAreaOfTriangle() {
        double a = this.point.get(0).getDistance(this.point.get(1));
        double b = this.point.get(1).getDistance(this.point.get(2));
        double c = this.point.get(0).getDistance(this.point.get(2));
        double s = (a+b+c) / 2;

        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }
}
