package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void calculateRectangle(){
        List<String> coordinates = Arrays.asList("1,1", "5,1", "1,3", "5,3");
        Figure rectangle = Rectangle.of(coordinates);
        rectangle.calculate();
        assertEquals(8, rectangle.getArea(), 0.001);
    }

}
