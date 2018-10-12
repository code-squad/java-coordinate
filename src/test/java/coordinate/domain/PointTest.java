package coordinate.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.util.Arrays;
import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Java6Assertions.offset;

public class PointTest {
    @Test(expected = IllegalArgumentException.class)
    public void boundaryCheck(){
        Point p1 = new Point(0, 0);
        System.out.println(p1);
        Point p2 = new Point(25, 25);
        System.out.println(p2);

    }

    @Test
    public void calculateLineLength(){
        Point p1 = new Point(1, 1);
        Point p2 = new Point(2, 2);
        assertThat(p1.calculateLineLength(p2)).isEqualTo(1.414, offset(0.00099));
    }

    @Test
    public void subPositionX(){
        Point p1 = new Point(2, 1);
        assertThat(Math.abs(p1.subPositionX(3))).isEqualTo(1);
    }

    @Test
    public void subPositionY(){
        Point p1 = new Point(2, 1);
        assertThat(Math.abs(p1.subPositionY(3))).isEqualTo(2);
    }

    @Test
    public void subPositionXByPoint(){
        Point p1 = new Point(5, 5);
        Point p2 = new Point(2, 3);

        assertThat(p1.subPositionX(p2)).isEqualTo(3);
    }

    @Test
    public void subPositionYByPoint(){
        Point p1 = new Point(5, 5);
        Point p2 = new Point(2, 3);

        assertThat(p1.subPositionY(p2)).isEqualTo(2);
    }


    @Test
    public void equals(){
        Point p1 = new Point(2, 1);
        Point p2 = new Point(2, 1);
        Point p3 = new Point(3, 1);
        Point p4 = new Point(3, 1);

        System.out.println(p1.equals(p2));
        System.out.println(p3.equals(p4));
        System.out.println(p2.equals(p3));
        System.out.println(p1.equals(p4));

        assertThat(p1).isEqualTo(p2);
        assertThat(p3).isEqualTo(p4);
        assertThat(p2.equals(p3)).isFalse();
        assertThat(p1.equals(p4)).isFalse();

        List points = Arrays.asList(new Point[]{p1,p2,p3,p4});
        System.out.println(points);

        Set<Point> pointSet = new HashSet<>();

        pointSet.add(p1);
        pointSet.add(p2);
        pointSet.add(p3);
        pointSet.add(p4);

        System.out.println(pointSet);

        System.out.println("point List Size : " + points.size());
        System.out.println("point Set Size : " + pointSet.size());

        System.out.println(points.size() == pointSet.size());

        assertThat(points.size() == pointSet.size()).isFalse();
    }
}
