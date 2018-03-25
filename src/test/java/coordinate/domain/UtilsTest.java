package coordinate.domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static coordinate.domain.Utils.*;

public class UtilsTest {

    @Test
    public void checkInputFormatNormal() {
        assertArrayEquals(new String[]{"(1,1)", "(2,2)"}, checkInputFormat("(1,1)-(2,2)"));
    }

    @Test
    public void isDuplicateTrue() {
        List<Point> points = Arrays.asList(new Point(0, 0), new Point(0, 0));
        assertEquals(true, isDuplicate(points));
    }

    @Test
    public void isDuplicateFalse() {
        List<Point> points = Arrays.asList(new Point(0, 1), new Point(0, 0));
        assertEquals(false, isDuplicate(points));
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkInputFormatThrowExceptionTooManyPoints() {
        checkInputFormat("(1,1)-(2,2)-(3,3)");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkInputFormatThrowExceptionNotEnoughPoints() {
        checkInputFormat("(1,1)");
    }

    @Test(expected = IllegalArgumentException.class)
    public void convertToIntegerArrayThrowExceptionDuringConversion() {
        convertToIntegerArray("(1,x)");
    }

}