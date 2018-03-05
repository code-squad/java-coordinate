import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class PointTest {
    String points = "(10,10)";
    String info = "10,10";
    List<String> xy = Arrays.asList(info.split(","));

    @Test
    public void removeSide(){
        String info = points.substring(1 , points.length()-1);
        assertEquals(info, "10,10");
    }

    @Test
    public void xValue(){
        List<String> xy = Arrays.asList(info.split(","));
        int xValue = Integer.parseInt(xy.get(0));
        assertEquals(xValue,10);
    }

    @Test
    public void yValue(){
        List<String> xy = Arrays.asList(info.split(","));
        int xValue = Integer.parseInt(xy.get(1));
        assertEquals(xValue,10);
    }
}
