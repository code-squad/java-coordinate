package domain.point;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test(expected = IllegalArgumentException.class)
    public void 최대24까지_할당() {
        new Point(25, 24);
    }

    @Test
    public void 같은_좌표값일때_같은_인스턴스로_인식하나() {
        Point firstPoint = new Point(24, 24);
        Point secondPoint = new Point(24, 24);
        assertEquals(true, firstPoint.equals(secondPoint));
    }
}