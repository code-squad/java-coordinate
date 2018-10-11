package coordinate.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RectangleTest {
    static Rectangle r;
    @Before
    public void before(){
        Point p1 = new Point(10, 10);
        Point p2 = new Point(22, 10);
        Point p3 = new Point(22, 18);
        Point p4 = new Point(10, 18);

        List list = Arrays.asList(p1,p2,p3,p4);

        r = new Rectangle(list);
    }

    @Test(expected = IllegalArgumentException.class)
    public void RectangleException(){
        Point p1 = new Point(10, 10);
        Point p2 = new Point(22, 10);
        Point p3 = new Point(22, 18);
        Point p4 = new Point(10, 12);

        List list = Arrays.asList(p1,p2,p3,p4);

        Rectangle r2 = new Rectangle(list);
    }

    @Test
    public void area(){
        assertThat(r.area()).isEqualTo(96);
    }

    @Test
    public void calculateWidth(){
        assertThat(r.calculateWidth()).isEqualTo(12);
    }

    @Test
    public void calculateHeight(){
        assertThat(r.calculateHeight()).isEqualTo(8);
    }

    @Test
    public void makeWidthSet(){
        Set<Integer> set = new HashSet<>();
        set.add(0);
        set.add(12);
        assertThat(r.makeWidthSet()).isEqualTo(set);
    }

    @Test
    public void makeHeightSet(){
            Set<Integer> set = new HashSet<>();
            set.add(0);
            set.add(8);
            assertThat(r.makeHeightSet()).isEqualTo(set);
    }


}
