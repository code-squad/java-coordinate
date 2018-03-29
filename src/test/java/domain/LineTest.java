package domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LineTest {
    @Test
    public void lineGetDistance() throws Exception{
        Point a = new Point(1,1);
        Point b = new Point(1,2);
        assertThat(a.getDistance(b),is(1.0));
    }


    @Test
    public void isWidth() throws Exception{
        Line line = new Line(new Point(1,1), new Point(2,1));
        assertTrue(line.isWidth());

        line = new Line(new Point(2,2), new Point(2,1));
        assertFalse(line.isWidth());
    }

    @Test
    public void isHeight() throws Exception{
        Line line = new Line(new Point(2,2), new Point(2,1));
        assertTrue(line.isHeight());

        line = new Line(new Point(1,2), new Point(2,2));
        assertFalse(line.isHeight());
    }
}
