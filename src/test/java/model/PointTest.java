package model;

import org.junit.Test;

import model.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;


public class PointTest {

    @Test
    public void point() {
        Point x = new Point(1,1);
        Point y = new Point(2,2);
        assertThat(x.makeLine(y)).isEqualTo(1.414,offset(0.00099));
    }
}
