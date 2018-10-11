package coordinate.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.offset;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LineTest {
    @Test
    public void area(){
        Point p1 = new Point(10, 10);
        Point p2 = new Point(14, 15);

        List list1 = Arrays.asList(p1,p2);

        Point p3 = new Point(0, 0);
        Point p4 = new Point(24, 24);

        List list2 = Arrays.asList(p3,p4);

        Line l1 = new Line(list1);
        Line l2 = new Line(list2);

        System.out.println(l1.area());
        System.out.println(l2.area());

        assertThat(l1.area()).isEqualTo(6.403, offset(0.00099));
        assertThat(l2.area()).isEqualTo(33.941, offset(0.00099));
    }

    @Test
    public void comparable(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(4,5);
        Point p3 = new Point(1,5);

        List list1 = Arrays.asList(p1,p2);
        List list2 = Arrays.asList(p1,p3);
        List list3 = Arrays.asList(p2,p3);

        Line l1 = new Line(list1);
        Line l2 = new Line(list2);
        Line l3 = new Line(list3);

        List list = Arrays.asList(l1, l2, l3);
        List sortedList = Arrays.asList(l3, l2, l1);

        Collections.sort(list);

        assertThat(list).isEqualTo(sortedList);
    }

    @Test
    public void getName(){
        Point p1 = new Point(1,1);
        Point p2 = new Point(4,5);

        List list1 = Arrays.asList(p1,p2);

        Figure l = new Line(list1);
        assertThat(l.getName()).isEqualTo("Line");
    }
}
