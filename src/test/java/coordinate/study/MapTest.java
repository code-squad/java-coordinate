package coordinate.study;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    @Test
    public void test(){
        Map<Integer, String> map = new HashMap();
        String s = "hello";
        map.put(1, yo(s));
        map.put(2, "two");
        map.put(3, "three");

        System.out.println(map.get(4));
//        if(null){
//
//        }
        System.out.println(map.get(null));
        Assertions.assertThat(map.get(4)).isEqualTo(null);


    }

    public static String yo(String s){
        return s+"!";
    }
}
