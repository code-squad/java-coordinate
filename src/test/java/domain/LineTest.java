package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class LineTest {
    Point a;
    Point b;
    Line line;

    @Before
    public void setup() {

    }

    @Test
    public void lineGetDistance() throws Exception{
        a = new Point(1,1);
        b = new Point(1,2);
        assertThat(a.getDistance(b),is(1.0));
    }


    @Test
    public void isWidth() throws Exception{
        a = new Point(1,1);
        b = new Point(2,1);
        line = new Line(a, b);
        assertTrue(line.isWidth());

        a = new Point(2,2);
        b = new Point(2,1);
        line = new Line(a, b);
        assertFalse(line.isWidth());
    }

    @Test
    public void isHeight() throws Exception{
        a = new Point(2,2);
        b = new Point(2,1);
        line = new Line(a, b);
        assertTrue(line.isHeight());

        a = new Point(1,2);
        b = new Point(2,2);
        line = new Line(a, b);
        assertFalse(line.isHeight());
    }
}
