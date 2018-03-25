package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class FigureTest {

    @Test
    public void hasCoordinateAt() {
        Figure figure;
        List<String> coordinates = Arrays.asList("1,1", "2,2");
        figure = Figure.createFigure(coordinates);
        assertThat(figure.hasCoordinateAt(1, 1), is(true));
        assertThat(figure.hasCoordinateAt(2, 2), is(true));
    }
}