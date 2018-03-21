package domain.figure;

import domain.point.Points;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
    private Rectangle rect;

    @Before
    public void setUp() throws Exception {
        Points pointRepo = new Points();
        pointRepo.addPoint(22, 18);
        pointRepo.addPoint(10, 10);
        pointRepo.addPoint(10, 18);
        pointRepo.addPoint(22, 10);
        rect = new Rectangle(pointRepo);
    }

    @Test
    public void 넓이계산() {
        assertEquals(96, rect.calcArea());
    }

    @Test
    public void 직사각형이_아닌_점() {
        Points pointRepo = new Points();
        pointRepo.addPoint(21, 18);
        pointRepo.addPoint(10, 10);
        pointRepo.addPoint(10, 14);
        pointRepo.addPoint(22, 10);
        assertEquals(false, Rectangle.isValidRectPoints(pointRepo));
    }

    @Test
    public void 직사각형인_점() {
        Points pointRepo = new Points();
        pointRepo.addPoint(22, 18);
        pointRepo.addPoint(10, 10);
        pointRepo.addPoint(10, 18);
        pointRepo.addPoint(22, 10);
        assertEquals(true, Rectangle.isValidRectPoints(pointRepo));
    }

    @Test
    public void 사각형_점_개수가_아님() {
        Points pointRepo = new Points();
        pointRepo.addPoint(22, 18);
        pointRepo.addPoint(10, 10);
        assertEquals(false, Rectangle.isRectPointNum(pointRepo));
    }

    @Test
    public void 사각형_점_개수() {
        Points pointRepo = new Points();
        pointRepo.addPoint(22, 18);
        pointRepo.addPoint(10, 10);
        pointRepo.addPoint(10, 18);
        pointRepo.addPoint(22, 10);
        assertEquals(true, Rectangle.isRectPointNum(pointRepo));
    }
}