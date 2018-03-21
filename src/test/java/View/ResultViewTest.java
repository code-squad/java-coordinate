package View;

import Domain.Figure;
import Domain.Point;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ResultViewTest {

    @Test
    public void drawYaxis_odd(){
        assertThat(ResultView.drawYaxis(1), is("     2|"));
    }
    @Test
    public void drawYaxis_even(){
        assertThat(ResultView.drawYaxis(2), is("      |"));
    }
    @Test
    public void drawPoint(){
        ArrayList<Point> points = new ArrayList<>(Arrays.asList(Point.of(1,1), Point.of(2,2)));
        Figure figure = Figure.of(points);
        assertThat(ResultView.drawPoint(1, 1, figure), is(".  "));
        assertThat(ResultView.drawPoint(1, 0, figure), is("  "));
    }
}
