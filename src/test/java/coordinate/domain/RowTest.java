package coordinate.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class RowTest {
    private List<Point> list;
    Row row;

    @Before
    public void setUp() throws Exception {
        row = new Row(2);
    }

    @Test
    public void addPoint() {
        assertEquals(true, row.addPoint(2, 2).isDot());
        assertEquals(false, row.addPoint(2, 3).isDot());
    }

    @Test
    public void dotAtPoint() {
        assertEquals(true, row.dotAtPoint(2));
    }
}