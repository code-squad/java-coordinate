package domain;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class LineTest {
    @Test
    public void calcLengthTest() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        Line line = new Line(p1, p2);
        assertThat(line.calcLength()).isEqualTo(5.0000);
    }
}
