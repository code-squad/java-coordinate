package Domain;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

public class FigureTest {

    Points points;

    @Before
    public void setUp(){
        points = Points.of(Arrays.asList(Point.of(1,1), Point.of(2,2)));
    }

    @Test
    public void hasCoordinateAt(){
        Figure figure = Figure.of(points);
        assertThat(figure.hasCoordinateAt(1,1), is(true));
        assertThat(figure.hasCoordinateAt(2,2), is(true));
        assertThat(figure.hasCoordinateAt(5,6), is(false));
    }

    @Test
    public void calculate(){
        assertEquals(Figure.calculate(points), 1.414, 0.001);
    }

}