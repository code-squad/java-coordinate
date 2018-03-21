package coordinate.domain;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void addPointsNormal() {
        List<Point> expected = new ArrayList<>();
        expected.add(new Point(1, 2));
        points = addPoints(points, new int[]{1, 2});
        assertArrayEquals(expected.toArray(), points.toArray());
    }

    @Test
    public void addPointsThrowException() {
        addPoints(points, new int[]{1, 2});
        exception.expect(IllegalArgumentException.class);
        addPoints(points, new int[]{1, 2});
    }

    @Test
    public void convertToIntegerArrayThrowExceptionDuringConversion() {
        exception.expect(IllegalArgumentException.class);
        convertToIntegerArray("(1,x)");
    }

    @Test
    public void convertToIntegerArrayThrowExceptionNot2DCoordinate() {
        exception.expect(IllegalArgumentException.class);
        convertToIntegerArray("(1,2,3)");
    }

    @Test
    public void convertToIntegerArrayThrowExceptionOutOfRange() {
        exception.expect(IllegalArgumentException.class);
        convertToIntegerArray("(1,30)");
    }

    @Test
    public void convertToIntegerArrayThrowExceptionOutOfDomain() {
        exception.expect(IllegalArgumentException.class);
        convertToIntegerArray("(30,1)");
    }

    @Test
    public void calculateDistance() {
    }
}