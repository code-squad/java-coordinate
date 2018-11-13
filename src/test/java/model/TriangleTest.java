package model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    List<Point> pointList = new ArrayList<>();
    Triangle triangle;

    @Before
    public void setUp() {
        pointList.add(PointCreator.position("1,1"));
        pointList.add(PointCreator.position("2,2"));
        pointList.add(PointCreator.position("3,3"));
        triangle = new Triangle(pointList);
    }

//    @Test
//    public void extent() {
//        assertThat(triangle.extent(3, 4, 5), is(6.0));
//    }

    @Test
    public void calcWidth() {
        assertThat(triangle.calcWidth(3, 4, 5), is(6));
    }

}
