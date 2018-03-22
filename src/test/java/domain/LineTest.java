package domain;

import domain.point.Point;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LineTest {
    private Line line;

    @Before
    public void setUp() throws Exception {
        ArrayList<Point> points = new ArrayList<>(
                Arrays.asList(new Point(1, 2), new Point(3, 4))
        );
        line = new Line(points);
    }

    @Test
    public void 거리계산() {
        assertEquals(2.8284, line.calcDistance(), 0.001);
    }
}