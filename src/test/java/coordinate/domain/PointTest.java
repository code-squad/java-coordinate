package coordinate.domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static coordinate.domain.Point.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void calculateDistanceFromTest() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        double distance = point1.calculateDistanceFrom(point2);
        assertEquals(5, distance, 0.001);
    }

    @Test
    public void getPointsOnSameRowTest() {
        List<Point> points = Arrays.asList(new Point(0, 0), new Point(0, 5), new Point(5, 0), new Point(5, 5));
        List<Point> expected = Arrays.asList(new Point(0, 0), new Point(5, 0));
        assertArrayEquals(expected.toArray(), points.get(0).getPointsPerRow(points).toArray());
    }

    @Test
    public void getPointsOnSameColumnTest() {
        List<Point> points = Arrays.asList(new Point(0, 0), new Point(0, 5), new Point(5, 0), new Point(5, 5));
        List<Point> expected = Arrays.asList(new Point(0, 0), new Point(0, 5));
        assertArrayEquals(expected.toArray(), points.get(0).getPointsPerColumn(points).toArray());
    }

    @Test
    public void checkDomainRangeNormal() {
        checkDomainRange(24, 24); // void
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDomainRangeExceptionOutOfDomain() {
        checkDomainRange(25, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkDomainRangeExceptionOutOfRange() {
        checkDomainRange(0, 25);
    }
}