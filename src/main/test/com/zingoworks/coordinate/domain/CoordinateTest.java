package com.zingoworks.coordinate.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinateTest {

    @Test
    public void getMarkingPoint() {
    }

    @Test
    public void getPoint() {
    }

    @Test
    public void ofRefined() {
        String[] a = {"1,1"};
        String[] b = {"(1,1)"};
        Coordinate aa = new Coordinate(a);
        Coordinate ab = new Coordinate(b);

//        assertEquals(aa,ab.ofRefined(b));
    }
}