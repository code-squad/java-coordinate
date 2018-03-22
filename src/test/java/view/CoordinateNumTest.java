package view;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoordinateNumTest {

    @Test
    public void 사각형_점개수() {
        assertEquals(true, CoordinateNum.isValidCoordinateNum(4));
    }

    @Test
    public void 삼각형_점개수() {
        assertEquals(true, CoordinateNum.isValidCoordinateNum(3));
    }

    @Test
    public void 라인_점개수() {
        assertEquals(true, CoordinateNum.isValidCoordinateNum(2));
    }

    @Test
    public void 유효하지않은_점개수() {
        assertEquals(false, CoordinateNum.isValidCoordinateNum(1));
    }

    @Test
    public void 유효하지않은_점개수2() {
        assertEquals(false, CoordinateNum.isValidCoordinateNum(-1));
    }
}