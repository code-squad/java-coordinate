package coordinate.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RowTest {
    private Row row;
    private List<Integer> xCoordOfPoints;

    @Before
    public void setUp() throws Exception {
        xCoordOfPoints = Arrays.asList(2, 3);
        row = new Row(xCoordOfPoints);
    }

    @Test
    public void addCoordinateTest() {
        assertEquals(true, row.addCoordinate(xCoordOfPoints, 2).isPoint());
        assertEquals(true, row.addCoordinate(xCoordOfPoints, 3).isPoint());
        assertEquals(false, row.addCoordinate(xCoordOfPoints, 4).isPoint());
    }

    @Test
    public void isPointAtTrue() {
        assertEquals(true, row.isPointAt(2));
        assertEquals(true, row.isPointAt(3));
    }

    @Test
    public void isPointAtFalse() {
        assertEquals(false, row.isPointAt(4));
    }
}