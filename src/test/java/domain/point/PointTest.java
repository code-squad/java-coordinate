package domain.point;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {
    @Test(expected = IllegalArgumentException.class)
    public void X에_24초과_할당() {
        new Point(25, 24);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Y에_24초과_할당() {
        new Point(24, 25);
    }

    @Test
    public void X에_0_할당() {
        Point point = new Point(0, 16);
        assertEquals(0, point.getXPosition());
    }

    @Test
    public void Y에_0_할당() {
        Point point = new Point(12, 0);
        assertEquals(0, point.getYPosition());
    }

    @Test
    public void X에_24_할당() {
        Point point = new Point(24, 3);
        assertEquals(24, point.getXPosition());
    }

    @Test
    public void Y에_24_할당() {
        Point point = new Point(19, 24);
        assertEquals(24, point.getYPosition());
    }

    @Test(expected = IllegalArgumentException.class)
    public void X에_마이너스값_할당() {
        new Point(-1, 24);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Y에_마이너스값_할당() {
        new Point(24, -1);
    }

    @Test
    public void 같은_좌표값일때_같은_인스턴스로_인식하나() {
        Point firstPoint = new Point(24, 24);
        Point secondPoint = new Point(24, 24);
        assertEquals(true, firstPoint.equals(secondPoint));
    }

    @Test
    public void 거리_계산() {
        Point aSide = new Point(10, 10);
        Point bSide = new Point(22, 10);
        assertEquals(12.000, aSide.calcDistance(bSide), 0.01);
    }

    @Test
    public void 대각선_관계일때() {
        Point aSide = new Point(10, 10);
        Point bSide = new Point(22, 18);
        assertEquals(true, aSide.isDiagonalRelation(bSide));
    }

    @Test
    public void 대각선_관계_아닐때() {
        Point aSide = new Point(10, 10);
        Point bSide = new Point(10, 18);
        assertEquals(false, aSide.isDiagonalRelation(bSide));
    }

    @Test
    public void 다른좌표_같은점인가() {
        Point aSide = new Point(10, 10);
        Point bSide = new Point(10, 18);
        assertEquals(false, aSide.equals(bSide));
    }

    @Test
    public void 같은좌표_같은점인가() {
        Point aSide = new Point(10, 10);
        Point bSide = new Point(10, 10);
        assertEquals(true, aSide.equals(bSide));
    }
}