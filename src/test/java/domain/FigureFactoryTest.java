package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FigureFactoryTest {

    @Test
    public void isRectangle_true(){
        List<String> coordinates = Arrays.asList("1,1", "2,2", "1,1", "2,2");
        assertThat(FigureFactory.isRectangle(coordinates), is(true));
    }

    @Test(expected = RuntimeException.class)
    public void isRectangle_false(){
        List<String> coordinates = Arrays.asList("1,1", "2,2", "1,1");
        FigureFactory.isRectangle(coordinates);
    }

    @Test
    public void isLine_true(){
        List<String> coordinates = Arrays.asList("1,1", "2,2");
        assertThat(FigureFactory.isLine(coordinates), is(true));
    }

    @Test
    public void isLine_false(){
        List<String> coordinates = Arrays.asList("1,1", "2,2", "1,1");
        assertThat(FigureFactory.isLine(coordinates), is(false));
    }

    @Test
    public void isTriangle_true(){
        List<String> coordinates = Arrays.asList("1,1", "2,2", "2,3");
        assertThat(FigureFactory.isTriangle(coordinates), is(true));
    }

    @Test
    public void isTriangle_false(){
        List<String> coordinates = Arrays.asList("1,1", "2,2");
        assertThat(FigureFactory.isTriangle(coordinates), is(false));
    }

}
