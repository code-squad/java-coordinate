package com.zingoworks.coordinate.domain;

import java.util.ArrayList;

public class Line {
    private Point x;
    private Point y;

//coordinate에서 point를 꺼내서
    public Line(ArrayList<Point> point) {
        if(coordinate.getPoint().size() != 2) {
            throw new IllegalArgumentException("직선의 성립조건이 아닙니다.");
        }

        this.x = coordinate.getPoint().get(0);
        this.y = coordinate.getPoint().get(1);
    }

    public double getDistanceOfLine() {
        return x.getDistance(y);
    }

//    스택오버플로우 에러발생... 뭔가 재귀적으로 무한루프?... 객체, 팩토리메서드에 대한 이해 필요
//
//    public Line(Coordinate coordinate) {
//        this.x = ofRefined(coordinate).x;
//        this.y = ofRefined(coordinate).y;
//    }
//
//    private Line ofRefined(Coordinate coordinate) {
//        if(coordinate.getPoint().size() != 2) {
//            throw new IllegalArgumentException("직선의 성립조건이 아닙니다.");
//        }
//
//        this.x = coordinate.getPoint().get(0);
//        this.y = coordinate.getPoint().get(1);
//
//        return new Line(coordinate);
//    }
}
