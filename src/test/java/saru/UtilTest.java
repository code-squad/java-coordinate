package saru;

import saru.domain.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UtilTest {
    @Test
    public void getMinMaxValue() {
        Point point1 = new Point(3, 3, true);
        Point point2 = new Point(5, 3, true);
        Point point3 = new Point(5, 7, true);
        Point point4 = new Point(3, 7, true);

        Set<Point> points = new HashSet<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);

        double minX = Util.getMinXValue(points);
        assertEquals(3, minX, 0.001);

        double minY = Util.getMinYValue(points);
        assertEquals(3, minY, 0.001);

        double maxX = Util.getMaxXValue(points);
        assertEquals(5, maxX, 0.001);

        double maxY = Util.getMaxYValue(points);
        assertEquals(7, maxY, 0.001);
    }
}
