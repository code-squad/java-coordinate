package coordinate.view;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static coordinate.view.Builder.*;

public class BuilderTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void addYLabel() {
        assertEquals("2", Builder.addYLabel(2)); //짝수
        assertEquals(" ", Builder.addYLabel(1)); //홀수
    }

    @Test
    public void formatRow() {
        String row = ".........."; //length = 10
        String expected = "                                                  "; //expected length = 50 = 60 - row.length()
        assertEquals(expected, Builder.formatRow(row));
    }

    @Test
    public void addPoint() {
        assertEquals(" *", Builder.addPoint(true, 10, 10)); //point is marked at some coordinate & not on any axis
        assertEquals("  ", Builder.addPoint(false, 10, 10)); //point is not marked at some coordinate & not on any axis

        assertEquals(" *", Builder.addPoint(true, 0, 0)); //point is marked at origin (0,0)
        assertEquals(" +", Builder.addPoint(false, 0, 0)); //point is not marked at (0,0)

        assertEquals(" *", Builder.addPoint(true, 1, 0)); //point is marked on x-axis (1,0)
        assertEquals(" -", Builder.addPoint(false, 1, 0)); //point is not marked on x-axis (1,0)

        assertEquals(" *", Builder.addPoint(true, 0, 1)); //point is marked on y-axis (0,1)
        assertEquals(" |", Builder.addPoint(false, 0, 1)); //point is not marked on y-axis (0,1)
    }

    @Test
    public void addXLabelNumber() {
        assertEquals(" 8", Builder.addXLabelNumber(8)); //even number less than 2 digits
        assertEquals("10", Builder.addXLabelNumber(10)); //even number >= 2 digits

        assertEquals("  ", Builder.addXLabelNumber(7)); //odd number less than 2 digits
        assertEquals("  ", Builder.addXLabelNumber(15)); //odd number >= 2 digits
    }
}