package coordinate.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static coordinate.domain.Points.*;

public class PointsTest {
    private List<Point> points;

    @Before
    public void setUp() throws Exception {
        points = new ArrayList<>();
    }

    @Test
    public void addPointsNormal() {
        List<Point> expected = Arrays.asList(new Point(1, 2));
        points = addPoints(points, new int[]{1, 2});
        assertArrayEquals(expected.toArray(), points.toArray());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addPointsThrowExceptionRedundantCoordinate() {
        addPoints(points, new int[]{1, 2});
        addPoints(points, new int[]{1, 2});
    }
}