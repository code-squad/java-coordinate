package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {
    private Line line1;
    private Line line2;

    @Before
    public void setUp() throws Exception {
        line1 = new Line(0);
        line2 = new Line(3);
    }

    @Test
    public void X축에_위치하는가() {
        assertEquals(true, line1.isXAxisPosition());
    }

    @Test
    public void X축에_위치하지않는가() {
        assertEquals(false, line2.isXAxisPosition());
    }
}