package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CoordinateCalculatorTest {
    ArrayList<Point> points;
    @Before
    public void setup() {
        points = new ArrayList<>();
    }

    @Test
    public void calculateLength() {
        Point a = new Point(10, 10);
        Point b = new Point(14, 15);
        points.add(a);
        points.add(b);
        assertEquals(6.403, CoordinateCalculator.calculateLength(points), 0.001);
    }
}
