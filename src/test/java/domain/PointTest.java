package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {
    Point point;
    Point point1;

    @Before
    public void setUP(){
        point = Point.of(1,1);
        point1 = Point.of(2,2);
    }

    @Test
    public void getLengthBwTwoPoints(){
        assertEquals(1.414, point.getLengthBwTwoPoints(point1), 0.001);
    }

    @Test
    public void getXDiff(){
        assertEquals(1, point.getXDiff(point1));
    }

    @Test
    public void getYDiff(){
        assertEquals(1, point.getYDiff(point1));
    }

}
