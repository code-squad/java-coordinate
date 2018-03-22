package coordinate.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static coordinate.domain.Points.*;

public class PointsTest {
    List<Point> points;

    @Before
    public void setUp() throws Exception {
        points = new ArrayList<>();
    }

    @Test
    public void addPointsNormal() {
        List<Point> expected = Arrays.asList(new Point(new int[]{1, 2}));
        points = addPoints(points, new int[]{1, 2});
        assertArrayEquals(expected.toArray(), points.toArray());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addPointsThrowExceptionRedundantCoordinate() {
        addPoints(points, new int[]{1, 2});
        addPoints(points, new int[]{1, 2});
    }

    @Test
    public void checkSquareNormal() {
        Point p1 = new Point(new int[]{0, 0});
        Point p2 = new Point(new int[]{10, 0});
        Point p3 = new Point(new int[]{0, 10});
        Point p4 = new Point(new int[]{10, 10});
        List<Point> points = Arrays.asList(p1, p2, p3, p4);
        List<Point> expected = Arrays.asList(p1, p2, p3, p4);
        assertArrayEquals(expected.toArray(), checkSquare(points).toArray()); //returns the same points list
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkSquareExceptionNotSquare() {
        Point p1 = new Point(new int[]{0, 0});
        Point p2 = new Point(new int[]{10, 0});
        Point p3 = new Point(new int[]{0, 10});
        Point p4 = new Point(new int[]{10, 11});
        List<Point> points = Arrays.asList(p1, p2, p3, p4);
        checkSquare(points);
    }
}