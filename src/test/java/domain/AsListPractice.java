package domain;

import org.junit.Test;

import java.util.*;

public class AsListPractice {
    @Test
    public void test1() {
        String[] arr = {"A", "B", "C", "D"};
        List<String> list = Arrays.asList(arr);
        /* java.lang.UnsupportedOperationException 발생! unmodifiable 이기 때문에 데이터 수정 불가! */
        // list.add("Insert Data");
        for(String str : list) {
            System.out.println(str);
        }
    }

    @Test
    public void test2() {
        String[] arr = {"A", "B", "C", "D"};
        List<String> list = new ArrayList<>();
        Collections.addAll(list, arr);
        /* 리스트에 배열에 있는 데이터를 모두 더하는 방식이기 때무에 추가적으로 데이터 수정 가능! */
        list.add("Inserted Data");
        for(String str : list)
            System.out.println(str);
    }

    @Test
    public void test3() {
        String[] arr = {"A", "B", "C", "D"};
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
        list.add("Inserted Data");
        for(String str : list)
            System.out.println(str);
    }
}
