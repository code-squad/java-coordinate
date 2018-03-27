package domain;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class FigureTest {

    @Test
    public void hasCoordinateAt() {
        List<String> coordinates = Arrays.asList("1,1", "2,2");
        FigureMaker figureMaker = new ConcreteFigureMaker();
        Figure figure = figureMaker.initFigure(coordinates);
        assertThat(figure.hasCoordinateAt(1, 1), is(true));
        assertThat(figure.hasCoordinateAt(2, 2), is(true));
    }
}