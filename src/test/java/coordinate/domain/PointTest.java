package coordinate.domain;

import org.junit.Test;

import static org.junit.Assert.*;
import static coordinate.domain.Point.*;

public class PointTest {

    @Test
    public void checkCoordinateValidityIsValid() {
        int[] expected = new int[]{1, 2};
        int[] actual = checkCoordinateValidity(new int[]{1, 2});
        assertArrayEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCoordinateValidityNot2DCoordinate() {
        checkCoordinateValidity(new int[]{1, 2, 3});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCoordinateValidityOutOfDomain() {
        checkCoordinateValidity(new int[]{25, 2});
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkCoordinateValidityOutOfRange() {
        checkCoordinateValidity(new int[]{1, 25});
    }
}