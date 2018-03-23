package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class PointsTest {

    @Test
    public void setCoordinates(){
        Points points = Points.of(Arrays.asList(Point.of(1,1), Point.of(2,2)));
        List<String> coordinates = Arrays.asList("1,1","2,2");
        assertThat(Points.setCoordinates(coordinates), is(points));
    }

    @Test
    public void isRectangle_true(){
        Points points = Points.of(Arrays.asList(Point.of(1,1), Point.of(2,2), Point.of(1,1), Point.of(2,2)));
        assertThat(points.isRectangle(), is(true));
    }

    @Test
    public void isRectangle_false(){
        Points points = Points.of(Arrays.asList(Point.of(1,1), Point.of(2,2), Point.of(3,3)));
        assertThat(points.isRectangle(), is(false));
    }

    @Test
    public void isLine_true(){
        Points points = Points.of(Arrays.asList(Point.of(1,1), Point.of(2,2)));
        assertThat(points.isLine(), is(true));
    }

    @Test
    public void isLine_false(){
        Points points = Points.of(Arrays.asList(Point.of(1,1)));
        assertThat(points.isLine(), is(false));
    }

    @Test
    public void calculateLine(){
        Points points = Points.of(Arrays.asList(Point.of(1,1), Point.of(2,2)));
        assertEquals(1.414, points.calculateLine(), 0.001);
    }

    @Test
    public void calculateRectangle(){
        Points points = Points.of(Arrays.asList(Point.of(1,1), Point.of(5,1), Point.of(1,3), Point.of(5,3)));
        assertEquals(8, points.calculateRectangle());
    }

    @Test
    public void contains_true(){
        Points points = Points.of(Arrays.asList(Point.of(1,1), Point.of(5,1), Point.of(1,3)));
        assertThat(points.contains(1,1), is(true));
    }

    @Test
    public void contains_false(){
        Points points = Points.of(Arrays.asList(Point.of(1,1), Point.of(5,1), Point.of(1,3)));
        assertThat(points.contains(1,5), is(false));
    }
}
