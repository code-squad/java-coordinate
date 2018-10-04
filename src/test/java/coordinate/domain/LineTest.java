package coordinate.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.offset;

import org.junit.Test;

public class LineTest {
    @Test
    public void length(){
        Point p1 = new Point(10, 10);
        Point p2 = new Point(14, 15);

        Point p3 = new Point(0, 0);
        Point p4 = new Point(24, 24);

        Line l1 = new Line(p1,p2);
        Line l2 = new Line(p3,p4);

        System.out.println(l1.length());
        System.out.println(l2.length());

        assertThat(l1.length()).isEqualTo(6.403, offset(0.00099));
        assertThat(l2.length()).isEqualTo(33.941, offset(0.00099));
    }
}
