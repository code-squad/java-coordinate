package coordinate.domain;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static coordinate.domain.Point.*;

public class PointTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void checkCoordinateValidityIsValid() {
        int[] expected = new int[]{1, 2};
        int[] actual = checkCoordinateValidity(new int[]{1, 2});
        assertArrayEquals(expected, actual);
    }

    @Test
    public void checkCoordinateValidityNot2DCoordinate() {
        exception.expect(IllegalArgumentException.class);
        checkCoordinateValidity(new int[]{1, 2, 3});
    }

    @Test
    public void checkCoordinateValidityOutOfDomain() {
        exception.expect(IllegalArgumentException.class);
        checkCoordinateValidity(new int[]{25, 2});
    }

    @Test
    public void checkCoordinateValidityOutOfRange() {
        exception.expect(IllegalArgumentException.class);
        checkCoordinateValidity(new int[]{1, 25});
    }
}