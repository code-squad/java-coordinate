package saru;

import org.junit.Test;
import saru.domain.*;
import saru.view.*;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CoordinateCalcTest {
    @Test
    public void makePoint() {
        Point point = new Point(0, 0, true);
        assertThat(point.getX(), is(0.0));
    }

    @Test
    public void calcLine() {
        CoordinateCalc coordinateCalc = new CoordinateCalc();
        coordinateCalc.InitLines();

        Point point1 = new Point(3, 3, true);
        Point point2 = new Point(4, 4, true);

        assertEquals(1.414, coordinateCalc.calcLine(point1, point2), 0.001);
    }
}