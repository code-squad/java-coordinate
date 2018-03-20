package view.coordinate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinatePointTest {
    private CoordinatePoint coordinatePoint;

    @Before
    public void setUp() throws Exception {
        coordinatePoint = new CoordinatePoint(13);
        coordinatePoint.drawPosition();
    }

    @Test(expected = RuntimeException.class)
    public void 그린부분_또_그리면_예외발생하는지() {
        coordinatePoint.drawPosition();
    }
}