package domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test(expected = Exception.class)
    public void getPoint() throws Exception{
        Point point = new Point(24,25);
    }

    @Test
    public void getDistance() throws Exception{
        Point point1 = new Point(1,1);
        Point point2 = new Point(2,1);

        assertThat(point1.getDistance(point2), is(1.0));
    }
}
