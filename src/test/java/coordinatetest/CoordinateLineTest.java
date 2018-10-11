package coordinatetest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
        Double[] doubleValue = new Double[]{1.0,2.0,3.0,4.0};

        List list1 = Arrays.asList(doubleValue);                    //asList : 배열을 리스트로 변환 (꺼내올순 있어도 추가는 안된다.)
        List list2 = Arrays.asList(doubleValue);
        List<Double> list3 = new ArrayList<>(Arrays.asList(5.0,6.0));
        System.out.println(list3);
        System.out.println(list1);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(list2.get(i)))                      //제네릭이 Integer일때는 == 로 비교 가능하나 Double때는 equals로 비교가능함.
                System.out.println(i + "번째 요소가 각각 같습니다.");
        }
    }


}
