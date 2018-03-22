package domain;

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

    @Test
    public void 거리계산() {
        assertEquals(2.8284, line.calcDistance(), 0.001);
    }
}