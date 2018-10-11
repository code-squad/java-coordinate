package coordinate.domain;

import java.util.Arrays;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.Test;

import java.util.List;

public class TriangleTest {
    @Test
    public void triangle(){
        Point p1 = new Point(10,10);
        Point p2 = new Point(14,15);
        Point p3 = new Point(20,8);

        List list = Arrays.asList(p1, p2, p3);

        Triangle t = new Triangle(list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void triangleExceptionTest1(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,1);
        Point p3 = new Point(1,1);

        List list = Arrays.asList(p1, p2, p3);

        Triangle t = new Triangle(list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void triangleExceptionTest2(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,3);
        Point p3 = new Point(1,9);

        List list = Arrays.asList(p1, p2, p3);

        Triangle t = new Triangle(list);
    }

    @Test
    public void area(){
        Point p1 = new Point(10,10);
        Point p2 = new Point(14,15);
        Point p3 = new Point(20,8);

        List list = Arrays.asList(p1, p2, p3);

        Triangle t = new Triangle(list);

        Assertions.assertThat(t.area()).isEqualTo(29.0, Offset.offset(0.09));
    }



}
