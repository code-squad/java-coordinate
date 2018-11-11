package coordinate.domain;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class PointTest {
    Point point;

    @Before
    public void setUp() {
        point = Point.ofXY(1,2);
    }

    @Test(expected = RuntimeException.class)
    public void MinSizeExceptionCheckTest() {
        point.sizeCheck(-1);
    }

    @Test(expected = RuntimeException.class)
    public void MaxSizeExceptionCheckTest() {
        point.sizeCheck(25);
    }

    @Test
    public void getDistance() {
        Point other = Point.ofXY(4,4);
        assertThat(point.getDistance(other)).isEqualTo(Math.sqrt(13));
    }

}
