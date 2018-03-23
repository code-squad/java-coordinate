package coordinate.domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static coordinate.domain.Line.*;

public class LineTest {

    @Test
    public void calculateDistanceTest() {
        List<Point> points;
        points = Arrays.asList(new Point(0, 0), new Point(10, 10));
        double expected = Math.sqrt(Math.pow(10, 2) + Math.pow(10, 2));
        assertEquals(expected, calculateDistance(points), 0.001);
    }

    @Test
    public void isLineTrue() {
        List<Point> points = Arrays.asList(new Point(0, 0), new Point(10, 10));
        assertEquals(true, isLine(points));
    }

    @Test
    public void isLineFalseOnlyOnePoint() {
        List<Point> points = Arrays.asList(new Point(0, 0));
        assertEquals(false, isLine(points));
    }

    @Test
    public void isLineFalseOnlyMoreThanTwoPoints() {
        List<Point> points = Arrays.asList(new Point(0, 0), new Point(10, 10), new Point(10, 0));
        assertEquals(false, isLine(points));
    }
}