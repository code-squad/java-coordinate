package domain.calculator;

import org.junit.Before;
import org.junit.Test;
import view.coordinate.Coordinate;

import static org.junit.Assert.assertEquals;

public class CoordinateTest {
    private Coordinate coordinate;

    @Before
    public void setUp() throws Exception {
        //calculator = Coordinate.of();
    }

    @Test
    public void Y가_0이_아닐때_X축에_위치하는_포지션인가() {
        assertEquals(false, coordinate.isXAxisPosition(24));
    }

    @Test
    public void Y가_0일때_X축에_위치하는_포지션인가() {
        assertEquals(true, coordinate.isXAxisPosition(0));
    }

    @Test
    public void X가_0이_아닐때_Y축에_위치하는_포지션인가() {
        assertEquals(false, coordinate.isYAxisPosition(5, 0));
    }

    @Test
    public void X가_0일때_Y축에_위치하는_포지션인가() {
        assertEquals(true, coordinate.isYAxisPosition(0, 24));
    }
}