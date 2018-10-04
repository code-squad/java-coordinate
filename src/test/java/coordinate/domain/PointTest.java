package coordinate.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.offset;

public class PointTest {
    @Test(expected = IllegalArgumentException.class)
    public void boundaryCheck(){
        Point p1 = new Point(0, 0);
        System.out.println(p1);
        Point p2 = new Point(25, 25);
        System.out.println(p2);
    }

    @Test
    public void calculateLineLength(){
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        assertThat(p1.calculateLineLength(p2)).isEqualTo(1.414, offset(0.00099));
    }

    @Test
    public void subPositionX(){
        Point p1 = new Point(2, 1);
        assertThat(Math.abs(p1.subPositionX(3))).isEqualTo(1);
    }

    @Test
    public void subPositionY(){
        Point p1 = new Point(2, 1);
        assertThat(Math.abs(p1.subPositionY(3))).isEqualTo(2);
    }


}
