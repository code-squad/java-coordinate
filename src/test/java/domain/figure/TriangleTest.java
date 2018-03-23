package domain.figure;

import domain.point.Point;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle triangle;

    @Before
    public void setUp() throws Exception {
        List<Point> points = Arrays.asList(new Point(10, 10), new Point(14, 15), new Point(20, 8));
        triangle = new Triangle(points);
    }

    @Test
    public void 넓이계산() {
        assertEquals(29.0, triangle.calcArea(), 0.1);
    }

    @Test
    public void 인스턴스_피규어_할당가능할까() {
        assertEquals(true, triangle instanceof Figure);
    }
}