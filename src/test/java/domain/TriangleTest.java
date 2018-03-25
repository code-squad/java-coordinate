package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void calculateTriangle() {
        List<String> coordinates = Arrays.asList("0,0", "0,1", "1,0");
        Triangle triangle = Triangle.of(coordinates);
        assertEquals(0.5, triangle.calculateTriangle(), 0.001);
    }
}
