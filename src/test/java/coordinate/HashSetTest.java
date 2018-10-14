package coordinate;

import coordinate.domain.Point;
import org.junit.Test;

import java.util.*;

public class HashSetTest {
    @Test
    public void hashSet기능() {
        Set<Point> points = new HashSet<>();
        points.add(Point.of(1,2));
        points.add(Point.of(1,2));
        points.add(Point.of(3,2));

        System.out.println(points);
        System.out.println(points.hashCode());
    }

    @Test
    public void 인자값전달() {
        List<String> values = new ArrayList<>();
        values.add("aa");
        values.add("aa");
        values.add("bb");

        Set<String> hs = new HashSet<>(values);
        System.out.println(hs);
    }

    @Test
    public void iterator활용() {
        Set<Point> points = new HashSet<>();
        Set<Point> set = new HashSet<>();

        points.add(Point.of(1,2));
        points.add(Point.of(1,2));
        points.add(Point.of(3,2));

        Iterator it = points.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
