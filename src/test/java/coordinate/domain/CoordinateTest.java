package coordinate.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

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
    public void 두점거리계산() {
        Coordinate p1 = Coordinate.of(1,1);
        Coordinate p2 = Coordinate.of(2,2);
        double distance = p1.getDistance(p2);
        assertThat(distance).isEqualTo(1.414, offset(0.00099));

    }
}
