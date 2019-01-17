package coordinates.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void compareTo() {

        Point p1 = new Point(3,1);
        Point p2 = new Point(3,7);
        Point p3 = new Point(5,7);
        Point p4 = new Point(7,1);
        List<Point> a = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));

        System.out.println("ㅇㅇ"+a);
        Collections.sort(a);
        System.out.println(a);
    }

    @Test
    public void compareToA() {

        Point p1 = new Point(22,10);
        Point p2 = new Point(22,18);
        Point p3 = new Point(10,18);
        Point p4 = new Point(10,10);
        List<Point> a = new ArrayList<>(Arrays.asList(p1, p2, p3, p4));

        System.out.println("ㅇㅇ"+a);
        Collections.sort(a);
        System.out.println(a);
    }
}