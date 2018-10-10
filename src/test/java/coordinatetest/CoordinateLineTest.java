package coordinatetest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CoordinateLineTest {
    @Test
    public void isIntegerTest() {
        int a = 4;
        double b = Math.sqrt(16);
        if (a == (int) b)
            System.out.println("트루");
        System.out.println("거짓");
        System.out.println((int) Math.sqrt(16));
    }

    @Test
    public void twoArrayListCompare() {
        List<Double> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();

        list1.add(1.0);
        list1.add(2.0);
        list1.add(3.0);
        list1.add(4.0);

        list2.add(1.0);
        list2.add(2.0);
        list2.add(3.0);
        list2.add(4.0);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i)))                      //제네릭이 Integer일때는 == 로 비교 가능하나 Double때는 equals로 비교가능함.
                System.out.println(i + "번째 요소가 각각 같습니다.");
        }
    }


}
