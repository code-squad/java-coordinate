package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;

public class FigureTest {

    @Test
    public void hasCoordinateAt() {
        List<String> coordinates = Arrays.asList("1,1", "2,2");
        FigureMaker figureMaker = new ConcreteFigureMaker();
        Figure figure = figureMaker.initFigure(coordinates);
        assertThat(figure.hasCoordinateAt(1, 1), is(true));
        assertThat(figure.hasCoordinateAt(2, 2), is(true));
    }

    @Test
    public void calculateRectangle(){
        List<String> coordinates = Arrays.asList("1,1", "5,1", "1,3", "5,3");
        Figure rectangle = Rectangle.of(coordinates);
        assertEquals(8, rectangle.calculateRectangle(), 0.001);
    }

    @Test
    public void calculateTriangle() {
        List<String> coordinates = Arrays.asList("0,0", "0,1", "1,0");
        Figure triangle = Triangle.of(coordinates);
        assertEquals(0.5, triangle.calculateTriangle(), 0.001);
    }

    @Test
    public void calculateLine(){
        List<String> coordinates = Arrays.asList("1,1","2,2");
        Figure line = Line.of(coordinates);
        assertEquals(1.414, line.calculateLine(), 0.001);
    }
}