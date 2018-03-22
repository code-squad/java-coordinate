package domain.figure;

import domain.point.Points;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    private Triangle triangle;

    @Before
    public void setUp() throws Exception {
        Points points = new Points();
        points.addPoint(10, 10);
        points.addPoint(14, 15);
        points.addPoint(20, 8);
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