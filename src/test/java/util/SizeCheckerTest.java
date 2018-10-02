package util;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

import static org.junit.Assert.*;

public class SizeCheckerTest {

    @Test
    public void numSizeCheck() {
        assertThat(SizeChecker.numSizeChecker(-1), is(Boolean.FALSE));
    }

    @Test
    public void pointSizeChecker() {
        String point = "(3,5)";
        assertThat(SizeChecker.pointSizeChecker(point), is(Boolean.TRUE));
    }

}