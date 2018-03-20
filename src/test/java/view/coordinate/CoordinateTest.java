package view.coordinate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinateTest {
    private Coordinate coordinate;

    @Before
    public void setUp() throws Exception {
        coordinate = new Coordinate();
    }

    @Test
    public void 기본적으로_좌표상에_점_표시할수있나() {
        assertEquals(false, coordinate.isDrawPosition(12, 12));
    }

    @Test
    public void 좌표상에_점_표시할수있나() {
        coordinate.drawPosition(24, 24);
        assertEquals(true, coordinate.isDrawPosition(24, 24));
    }

    @Test
    public void Y축에_해당하나() {
        assertEquals(true, coordinate.isYAxisPosition(0, 24));
    }

    @Test
    public void Y축에_해당하지않나() {
        assertEquals(false, coordinate.isYAxisPosition(1, 24));
    }

    @Test
    public void X축에_해당하나() {
        assertEquals(false, coordinate.isYAxisPosition(16, 0));
    }

    @Test
    public void X축에_해당하지않나() {
        assertEquals(true, coordinate.isYAxisPosition(0, 9));
    }
}