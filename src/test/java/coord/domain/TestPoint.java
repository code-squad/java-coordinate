package coord.domain;

import coord.domain.Point;
import org.assertj.core.data.Offset;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestPoint {
    @Test
    public void distanceOf(){
        Point p1 = Point.of(1, 1);
        Point p2 = Point.of(4, 5);
        assertThat(p1.distanceTo(p2)).isCloseTo(5, Offset.offset(0.001));
    }

    @Test(expected = IllegalArgumentException.class)
    public void MaximumTest() {
        Point.of(33,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void MinimumTest() {
        Point.of(2, -2);
    }
}
