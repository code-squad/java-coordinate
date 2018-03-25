package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RectangleTest {

    @Test
    public void isRectangle_true(){
        List<String> coordinates = Arrays.asList("1,1", "2,2", "1,1", "2,2");
        assertThat(Rectangle.isRectangle(coordinates), is(true));
    }

    @Test
    public void isRectangle_false(){
        List<String> coordinates = Arrays.asList("1,1", "2,2", "1,1");
        assertThat(Rectangle.isRectangle(coordinates), is(false));
    }
}
