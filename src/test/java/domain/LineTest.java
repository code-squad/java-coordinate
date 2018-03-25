package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class LineTest {

    @Test
    public void isLine_true(){
        List<String> coordinates = Arrays.asList("1,1", "2,2");
        assertThat(Line.isLine(coordinates), is(true));
    }

    @Test
    public void isLine_false(){
        List<String> coordinates = Arrays.asList("1,1", "2,2", "1,1");
        assertThat(Line.isLine(coordinates), is(false));
    }
}
