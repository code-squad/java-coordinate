package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FigureUtilTest {

    @Test
    public void isLine_true(){
        List<String> coordinates = Arrays.asList("1,1", "2,2");
        assertThat(FigureUtil.isLine(coordinates), is(true));
    }

    @Test
    public void isLine_false(){
        List<String> coordinates = Arrays.asList("1,1", "2,2", "1,1");
        assertThat(FigureUtil.isLine(coordinates), is(false));
    }

    @Test
    public void isRectangle_true(){
        List<String> coordinates = Arrays.asList("1,1", "2,2", "1,1", "2,2");
        assertThat(FigureUtil.isRectangle(coordinates), is(true));
    }

    @Test
    public void isRectangle_false(){
        List<String> coordinates = Arrays.asList("1,1", "2,2", "1,1");
        assertThat(FigureUtil.isRectangle(coordinates), is(false));
    }

    @Test
    public void isTriangle_true(){
        List<String> coordinates = Arrays.asList("1,1", "2,2", "2,3");
        assertThat(FigureUtil.isTriangle(coordinates), is(true));
    }

    @Test
    public void isTriangle_false(){
        List<String> coordinates = Arrays.asList("1,1", "2,2");
        assertThat(FigureUtil.isTriangle(coordinates), is(false));
    }
}
