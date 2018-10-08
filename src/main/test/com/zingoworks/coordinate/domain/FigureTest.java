package com.zingoworks.coordinate.domain;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FigureTest {

    @Test
    public void getArea() {
    }

    @Test
    public void throwExceptionByNumberOfPoints() {
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point("3,3"));
        points.add(new Point("5,12"));
        points.add(new Point("5,5"));

        Triangle t = new Triangle(points);

        Rectangle r = new Rectangle(points);
    }
}