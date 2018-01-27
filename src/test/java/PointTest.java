import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PointTest {
    ArrayList<Boolean> points = new ArrayList<Boolean>();

    @Before
    public void setUp(){

    }

    @Test
    public void addTest(){
        Boolean result = points.add(true);
        assertEquals(result, true);
    }

//    @Test
//    public void notAdd(){
//        Boolean result = points.add(false);
//        assertEquals(result, false);
//    }
}
