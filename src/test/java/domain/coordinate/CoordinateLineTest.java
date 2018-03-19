package domain.coordinate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoordinateLineTest {
    private CoordinateLine coordinateLine1;
    private CoordinateLine coordinateLine2;

    @Before
    public void setUp() throws Exception {
        coordinateLine1 = new CoordinateLine(0);
        coordinateLine2 = new CoordinateLine(3);
    }

    @Test
    public void X축에_위치하는가() {
        assertEquals(true, coordinateLine1.isXAxisPosition());
    }

    @Test
    public void X축에_위치하지않는가() {
        assertEquals(false, coordinateLine2.isXAxisPosition());
    }
}