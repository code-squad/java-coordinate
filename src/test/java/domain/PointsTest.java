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
        assertThat(Points.initCoordinates(coordinates), is(points));
    }

    @Test
    public void calculateLine(){
        Points points = Points.of(Arrays.asList(Point.of(1,1), Point.of(2,2)));
        assertEquals(1.414, points.calculateLine(), 0.001);
    }

    @Test
    public void calculateTriangle(){
        Points points = Points.of(Arrays.asList(Point.of(0,0), Point.of(0,1), Point.of(1, 0)));
        assertEquals(0.5, points.calculateTriangle(), 0.001);
    }

    @Test
    public void calculateRectangle(){
        Points points = Points.of(Arrays.asList(Point.of(1,1), Point.of(5,1), Point.of(1,3), Point.of(5,3)));
        assertEquals(8, points.calculateRectangle(), 0.001);
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
