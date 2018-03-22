package coordinate.domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static coordinate.domain.Utils.*;

public class UtilsTest {

    @Test
    public void checkInputFormatNormal() {
        assertArrayEquals(new String[]{"(1,1)", "(2,2)"}, checkInputFormat("(1,1)-(2,2)"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkInputFormatThrowExceptionTooManyPoints() {
        checkInputFormat("(1,1)-(2,2)-(3,3)");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkInputFormatThrowExceptionNotEnoughPoints() {
        checkInputFormat("(1,1)");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertToIntegerArrayThrowExceptionDuringConversion() {
        convertToIntegerArray("(1,x)");
    }

    @Test
    public void calculateDistanceTest() {
        List<Point> points;
        points = Arrays.asList(new Point(new int[]{0, 0}), new Point(new int[]{10, 10}));
        double expected = Math.sqrt(Math.pow(10, 2) + Math.pow(10, 2));
        assertEquals(expected, calculateDistance(points), 0.001);
    }

    @Test
    public void calculateAreaTest() {
        Point p1 = new Point(new int[]{0, 0});
        Point p2 = new Point(new int[]{10, 0});
        Point p3 = new Point(new int[]{0, 10});
        Point p4 = new Point(new int[]{10, 10});
        List<Point> points = Arrays.asList(p1, p2, p3, p4);
        assertEquals(100, calculateArea(points));
    }
}