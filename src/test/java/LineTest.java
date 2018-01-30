import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LineTest {
    Point point1 = new Point("(10,10)");
    Point point2 = new Point("(13,14)");

    @Test
    public void xDistance(){
        int xDistance = point2.xValue() - point1.xValue();
        assertEquals(xDistance, 3);
    }

    @Test
    public void yDistance(){
        int yDistance = point2.yValue() - point1.yValue();
        assertEquals(yDistance, 4);
    }

    @Test
    public void calculateDistance(){
        double distance = Math.sqrt(Math.pow(point2.xValue() - point1.xValue(), 2) + Math.pow(point2.yValue() - point1.yValue(), 2));
        assertEquals(distance, 5.0);
    }
}
