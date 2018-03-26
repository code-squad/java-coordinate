package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class CoordinateBaseBaseTest {
    ArrayList<Point> points;
    CoordinateBase coordinateBase;

    @Before
    public void setup() {
        coordinateBase = new CoordinateBase();
        points = new ArrayList<>();
//        Point point1 = new Point(5,10);
//        Point point2 = new Point(5,15);
//        Point point3 = new Point(5,20);
        Point point1 = new Point(1,1);
        Point point2 = new Point(5,20);
        Point point3 = new Point(7,20);
        points.add(point1);
        points.add(point2);
        points.add(point3);
    }

//    @Test
//    public void sortDesc() {
//        ArrayList<Point> result = coordinateBase.sortDesc(points);
//        for (Point point :result) {
//            System.out.println(point.toString());
//        }
//    }

    @Test
    public void sortLinkedListDesc() {
        HashMap<Integer, LinkedList<Integer>> list = coordinateBase.getPointsList(points);
    }
}
