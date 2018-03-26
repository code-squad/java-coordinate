package saru;

import saru.domain.*;

import java.util.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {
    @Test(expected = IllegalArgumentException.class)
    public void invalidTrianglePosition() {
        Point point1 = new Point(4, 3, true);
        Point point2 = new Point(5, 3, true);
        Point point3 = new Point(6, 3, true);

        Set<Point> points = new HashSet<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);

        Triangle triangle = new Triangle(points);
        triangle.area();
    }

    @Test
    public void TriangleCalc() {
        Point point1 = new Point(2, 2, true);
        Point point2 = new Point(2, 4, true);
        Point point3 = new Point(4, 4, true);

        Set<Point> points = new HashSet<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);

        Triangle triangle = new Triangle(points);
        double result = triangle.area();
        assertEquals(2, result, 0.001);
    }
}
