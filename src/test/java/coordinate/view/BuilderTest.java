package coordinate.view;

import coordinate.domain.Coordinate;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderTest {

    @Test
    public void addCoordinate_NoPoint_YAxis_YLabelIsOneDigit() {
        assertEquals(" |", Builder.addCoordinate(Coordinate.ofNoPoint(0, 4)));
    }

    @Test
    public void addCoordinate_NoPoint_YAxis_YLabelIsTwoDigits_YIsEven() {
        assertEquals("|", Builder.addCoordinate(Coordinate.ofNoPoint(0, 10)));
    }

    @Test
    public void addCoordinate_NoPoint_YAxis_YLabelIsTwoDigits_YIsOdd() {
        assertEquals(" |", Builder.addCoordinate(Coordinate.ofNoPoint(0, 11)));
    }

    @Test
    public void addCoordinate_NoPoint_OnXAxis() {
        assertEquals(" -", Builder.addCoordinate(Coordinate.ofNoPoint(10, 0)));
    }

    @Test
    public void addCoordinate_NoPoint_Origin() {
        assertEquals(" +", Builder.addCoordinate(Coordinate.ofNoPoint(0, 0)));
    }

    @Test
    public void addCoordinate_IsPoint_YIsOneDigit() {
        assertEquals(" *", Builder.addCoordinate(Coordinate.ofPoint(9, 9)));
    }

    @Test
    public void addCoordinate_IsPoint_YIsNotOneDigit() {
        assertEquals("*", Builder.addCoordinate(Coordinate.ofPoint(10, 10)));
    }

    @Test
    public void addCoordinate_NoPoint_NotOnAxis() {
        assertEquals("  ", Builder.addCoordinate(Coordinate.ofNoPoint(10, 10)));
    }
}