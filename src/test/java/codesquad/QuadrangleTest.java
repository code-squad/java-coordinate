package codesquad;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuadrangleTest {
    @Test
    public void area() {
        Point p1 = new Point(10, 10);
        Point p2 = new Point(20, 10);
        Point p3 = new Point(10, 20);
        Point p4 = new Point(20, 20);

        Quadrangle quadrangle = new Quadrangle(p1, p2, p3, p4);
        assertThat(quadrangle.area()).isEqualTo(100);
    }
}
