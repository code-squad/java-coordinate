package coordinate.domain;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PointsTest {
    private Set<int[]> xyCoordinates;

    @Before
    public void setUp() throws Exception {
        xyCoordinates = new HashSet<>();
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void addToSet() {
        Set<int[]> expected = new HashSet<>();
        expected.add(new int[]{1, 2});
        xyCoordinates = Points.addPoints(xyCoordinates, new int[]{1, 2});
        assertArrayEquals(expected.toArray(), xyCoordinates.toArray());
    }

    @Test
    public void addToSetException() {
        Points.addPoints(xyCoordinates, new int[]{1, 2});
        exception.expect(IllegalArgumentException.class);
        Points.addPoints(xyCoordinates, new int[]{1, 2});
    }


    @Test
    public void convertToIntegerArray() {
    }

    @Test
    public void containsY() {
    }

    @Test
    public void getXIndex() {
    }

    @Test
    public void calculateDistance() {
    }
}