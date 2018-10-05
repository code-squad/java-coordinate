package domain;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

public class PointTest {

    @Test
    public void getDistance() {
        Point p1 = Point.init(1, 1);
        Point p2 = Point.init(10, 10);

        assertEquals(p1.getDistance(p2), 12.727, 0.001);
    }

}