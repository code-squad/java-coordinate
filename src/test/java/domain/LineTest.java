package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LineTest {

    @Test
    public void calculateLine(){
        List<String> coordinates = Arrays.asList("1,1","2,2");
        Figure line = Line.of(coordinates);
        line.calculate();
        assertEquals(1.414, line.getArea(), 0.001);
    }
}
