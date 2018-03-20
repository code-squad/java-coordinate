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
    public void addYLabelEvenNumber() {
        assertEquals("2", addYLabel(2)); //짝수
    }

    @Test
    public void addYLabelOddNumber() {
        assertEquals(" ", addYLabel(1)); //홀수
    }

    @Test
    public void formatRowTest() {
        String row = ".........."; //length = 10
        String expected = "                                                  "; //expected length = 50 = 60 - row.length()
        assertEquals(expected, formatRow(row));
    }

    @Test
    public void addPointNotOnAxis() {
        assertEquals(" *", addPoint(true, 10, 10)); //point is marked at some coordinate & not on any axis
        assertEquals("  ", addPoint(false, 10, 10)); //point is not marked at some coordinate & not on any axis
    }

    @Test
    public void addPointOnYAxis() {
        assertEquals(" *", addPoint(true, 0, 1)); //point is marked on y-axis (0,1)
        assertEquals(" |", addPoint(false, 0, 1)); //point is not marked on y-axis (0,1)
    }

    @Test
    public void addPointOnXAxis() {
        assertEquals(" *", addPoint(true, 1, 0)); //point is marked on x-axis (1,0)
        assertEquals(" -", addPoint(false, 1, 0)); //point is not marked on x-axis (1,0)
    }

    @Test
    public void addPointOnOrigin() {
        assertEquals(" *", addPoint(true, 0, 0)); //point is marked at origin (0,0)
        assertEquals(" +", addPoint(false, 0, 0)); //point is not marked at (0,0)
    }

    @Test
    public void addXLabelEvenNumber() {
        assertEquals(" 8", addXLabelNumber(8)); //even number less than 2 digits
        assertEquals("10", addXLabelNumber(10)); //even number >= 2 digits
    }

    @Test
    public void addXLabelOddNumber() {
        assertEquals("  ", addXLabelNumber(7)); //odd number less than 2 digits
        assertEquals("  ", addXLabelNumber(15)); //odd number >= 2 digits
    }
}