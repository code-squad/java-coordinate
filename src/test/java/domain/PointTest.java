package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    private Point point;

    @Before
    public void setUp() throws Exception {
        point = new Point(24);
    }

    @Test
    public void 자신의_위치가_맞는가() {
        assertEquals(true, point.isMatchPosition(24));
    }
}