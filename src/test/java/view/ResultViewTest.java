package view;


import domain.Figure;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

public class ResultViewTest {

    @Test
    public void makeNumIndent() {
        assertThat(ResultView.makeNumIndent(1), is("  "));
    }

    @Test
    public void numSizeIndent() {
        assertThat(ResultView.numSizeIndent(10), is("10"));
    }

    @Test
    public void checkFirst() {
        int point = Figure.EXIST;
        assertThat(ResultView.checkFirst(point), is(ResultView.BODY_EXIST));
    }

    @Test
    public void drawPoint() {
        assertThat(ResultView.drawPoint(0, Figure.NONE), is(ResultView.FIRST_NONE));
    }

}