package com.zingoworks.coordinate.domain;

import java.util.ArrayList;

public abstract class Figure {

    //도형의 면적 구하기
    abstract double getArea();

    //예외처리, 좌표의 개수에 기반
    abstract void throwExceptionByNumberOfPoints(ArrayList<Point> point);
}
