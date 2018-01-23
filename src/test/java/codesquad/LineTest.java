package codesquad;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class LineTest {
    @Test
    public void length() {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);

        Line line = new Line(p1, p2);
        assertThat(line.length()).isEqualTo(1.414, offset(0.00099));
    }
}
