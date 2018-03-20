package domain.figure;

import domain.point.Points;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTest {
    private Line line;
    private Points pointRepo = new Points();

    @Before
    public void setUp() throws Exception {
        pointRepo.addPoint(1, 2);
        pointRepo.addPoint(3, 4);
        line = new Line(pointRepo);
    }

    @Test(expected = IllegalArgumentException.class)
    public void 점이_2개_아닐때_생성되나() {
        pointRepo.addPoint(5, 6);
        new Line(pointRepo);
    }

    @Test
    public void 점이_2개일때_생성되나() {
        new Line(pointRepo);
    }

    @Test
    public void 거리계산() {
        assertEquals(2.8284, line.calcDistance(), 0.001);
    }
}