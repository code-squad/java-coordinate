package view;


import domain.Points;
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
        int point = Points.EXIST;
        assertThat(ResultView.checkFirst(point), is(ResultView.BODYEXIST));
    }

    @Test
    public void drawPoint() {
        assertThat(ResultView.drawPoint(0, Points.NONE), is(ResultView.FIRSTNONE));
    }

}