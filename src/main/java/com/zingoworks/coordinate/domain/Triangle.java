package com.zingoworks.coordinate.domain;

import java.util.List;

public class Triangle extends Figure {
    private List<Point> points;

    public Triangle(List<Point> points){
        super(3, "삼각형의 성립조건이 아닙니다.");
        this.points = points;

        throwExceptionByNumberOfPoints(points);

        if(getArea() == 0) {
            throw new IllegalArgumentException("삼각형의 성립조건이 아닙니다.");
        }
    }

    @Override
    public String getFigure() {
        return "삼각형";
    }

    @Override
    public double getArea() {
        double a = this.points.get(0).getDistance(this.points.get(1));
        double b = this.points.get(1).getDistance(this.points.get(2));
        double c = this.points.get(0).getDistance(this.points.get(2));
        double s = (a+b+c) / 2;

        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
    }

    //    @Override
//    public double getArea() {
//        double a = this.points.get(0).getDistance(this.points.get(1));
//        double b = this.points.get(1).getDistance(this.points.get(2));
//        double c = this.points.get(0).getDistance(this.points.get(2));
//        double s = (a+b+c) / 2;
//
//        return Math.sqrt(s * (s-a) * (s-b) * (s-c));
//    }
}
