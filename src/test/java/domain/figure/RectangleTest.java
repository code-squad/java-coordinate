package domain.figure;

import domain.point.Point;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    private Rectangle rect;

    @Before
    public void setUp() throws Exception {
        List<Point> points = Arrays.asList(new Point(22, 18), new Point(10, 10), new Point(10, 18), new Point(22, 10));
        rect = new Rectangle(points);
    }

    @Test
    public void 넓이계산() {
        assertEquals(96.0, rect.calcArea(), 0.1);
    }

    @Test
    public void 직사각형이_아닌_점() {
        List<Point> points = Arrays.asList(new Point(21, 18), new Point(10, 10), new Point(10, 14), new Point(22, 10));
        assertEquals(false, Rectangle.isValidRectPoints(points));
    }

    @Test
    public void 직사각형인_점() {
        List<Point> points = Arrays.asList(new Point(22, 18), new Point(10, 10), new Point(10, 18), new Point(22, 10));
        assertEquals(true, Rectangle.isValidRectPoints(points));
    }

    @Test
    public void 인스턴스_피규어_할당가능할까() {
        assertEquals(true, rect instanceof Figure);
    }
}