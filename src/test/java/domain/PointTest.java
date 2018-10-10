package domain;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

public class PointTest {

    @Test
    public void getDistance() {
        Point p1 = Point.init(1, 1);
        Point p2 = Point.init(1, 10);

        assertEquals(9.0, p1.getDistance(p2), 0.001);
    }

}