package coordinate.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RowTest {
    private Row row;

    @Before
    public void setUp() throws Exception {
        row = Row.ofPointOnRow(2);
    }

    @Test
    public void addPoint() {
        assertEquals(true, row.addCoordinate(2, 2).isDot());
        assertEquals(false, row.addCoordinate(2, 3).isDot());
    }

    @Test
    public void dotAtPoint() {
        assertEquals(true, row.dotAtPoint(2));
    }
}