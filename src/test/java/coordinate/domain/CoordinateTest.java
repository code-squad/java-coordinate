package coordinate.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinateTest {

    @Test
    public void 좌표생성() {
        Coordinate p = Coordinate.of(1,1);
        assertThat(p).isEqualTo(Coordinate.of(1,1));
    }

    @Test (expected = IllegalArgumentException.class)
    public void 좌표생성_입력범위초과_음수() {
        Coordinate p = Coordinate.of(-1, 23);
    }

    @Test (expected = IllegalArgumentException.class)
    public void 좌표생성_입력범위초과() {
        Coordinate p = Coordinate.of(4, 30);
    }

    @Test
    public void 두점의X좌표계산() {
        Coordinate a = Coordinate.of(1,1);
        Coordinate b = Coordinate.of(6,2);
        int c = a.subtractXCoordinateFrom(b);
        assertThat(c).isEqualTo(5);
    }

    @Test
    public void 두점의Y좌표계산() {
        Coordinate a = Coordinate.of(1,1);
        Coordinate b = Coordinate.of(2,3);
        int c = a.subtractYCoordinateFrom(b);
        assertThat(c).isEqualTo(2);
    }
}
