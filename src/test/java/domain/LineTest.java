package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LineTest {

    @Test
    public void calculateLine(){
        List<String> coordinates = Arrays.asList("1,1","2,2");
        Line line = Line.of(coordinates);
        assertEquals(1.414, line.calculateLine(), 0.001);
    }
}
