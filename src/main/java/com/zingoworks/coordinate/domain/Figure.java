package com.zingoworks.coordinate.domain;

import java.util.List;

public abstract class Figure {
    int numberOfPoints;
    String errorStatement;

//    예외처리, 좌표의 개수에 기반
    void throwExceptionByNumberOfPoints(List<Point> points) {
        if(points.size() != numberOfPoints){
            throw new IllegalArgumentException(errorStatement);
        }
    }
}
