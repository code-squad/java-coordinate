package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TriangleTest {

    @Test
    public void isTriangle_true(){
        List<String> coordinates = Arrays.asList("1,1", "2,2", "2,3");
        assertThat(Triangle.isTriangle(coordinates), is(true));
    }

    @Test
    public void isTriangle_false(){
        List<String> coordinates = Arrays.asList("1,1", "2,2");
        assertThat(Triangle.isTriangle(coordinates), is(false));
    }
}
