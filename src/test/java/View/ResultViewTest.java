package View;

import Model.Board;
import Model.Point;
import org.junit.Test;

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
        Board board = Board.of();
        board.setPoint(1,1);
        assertThat(ResultView.drawPoint(1, 1, board), is("*  "));
        assertThat(ResultView.drawPoint(1, 0, board), is("   "));
    }
}
