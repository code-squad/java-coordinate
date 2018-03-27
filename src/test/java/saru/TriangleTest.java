package saru;

import org.junit.Before;
import saru.domain.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {
    private Set<Point> points;

    @Before
    public void init() {
        points = new HashSet<>();
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidTrianglePosition() {
        addSetIllegalValue();

        Triangle triangle = new Triangle(points);
        triangle.area();
    }

    private void addSetIllegalValue() {
        Point point1 = new Point(4, 3, true);
        Point point2 = new Point(5, 3, true);
        Point point3 = new Point(6, 3, true);

        points.add(point1);
        points.add(point2);
        points.add(point3);
    }

    @Test
    public void TriangleCalc() {
        addSetNormalValue();

        Triangle triangle = new Triangle(points);
        double result = triangle.area();
        assertEquals(2, result, 0.001);
    }

    private void addSetNormalValue() {
        Point point1 = new Point(2, 2, true);
        Point point2 = new Point(2, 4, true);
        Point point3 = new Point(4, 4, true);

        points.add(point1);
        points.add(point2);
        points.add(point3);
    }
}
