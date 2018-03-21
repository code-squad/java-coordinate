package coordinate.domain;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static coordinate.domain.Utils.*;

public class UtilsTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void checkInputFormatNormal() {
        assertArrayEquals(new String[]{"(1,1)", "(2,2)"}, checkInputFormat("(1,1)-(2,2)"));
    }

    @Test
    public void checkInputFormatThrowExceptionTooManyPoints() {
        exception.expect(IllegalArgumentException.class);
        checkInputFormat("(1,1)-(2,2)-(3,3)");
    }

    @Test
    public void checkInputFormatThrowExceptionNotEnoughPoints() {
        exception.expect(IllegalArgumentException.class);
        checkInputFormat("(1,1)");
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
    public void calculateDistanceTest() {
        List<Point> points;
        points = Arrays.asList(new Point(0, 0), new Point(10, 10));
        double expected = Math.sqrt(Math.pow(10, 2) + Math.pow(10, 2));
        assertEquals(expected, calculateDistance(points), 0.001);
    }
}