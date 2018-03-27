package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void calculateTriangle() {
        List<String> coordinates = Arrays.asList("0,0", "0,1", "1,0");
        Figure triangle = Triangle.of(coordinates);
        triangle.calculate();
        assertEquals(0.5, triangle.getArea(), 0.001);
    }
}
