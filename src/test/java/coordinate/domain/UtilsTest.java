package coordinate.domain;

import org.junit.Test;

import static org.junit.Assert.*;
import static coordinate.domain.Utils.*;

public class UtilsTest {

    @Test
    public void checkInputFormatNormal() {
        assertArrayEquals(new String[]{"(1,1)", "(2,2)"}, checkInputFormat("(1,1)-(2,2)"));
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