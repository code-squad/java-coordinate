package view;

import domain.Point;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import static org.junit.Assert.*;

public class InputViewTest {

    @Test
    public void makePoint() {
        String point = "(23,3)";
        Point p = Point.init(23, 3);
        assertThat(InputView.makePoint(point), is(p));
    }


}