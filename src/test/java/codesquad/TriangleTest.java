package codesquad;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void area() {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(14, 15);
        Point p3 = new Point(20, 8);

        Triangle triangle = new Triangle(p1, p2, p3);
        assertThat(triangle.area()).isEqualTo(29.0, offset(0.0000001));
    }
}
