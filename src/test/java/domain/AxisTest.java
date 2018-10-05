package domain;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AxisTest {
    Axis axis;

    @Before
    public void setUp() throws Exception {
        axis = new Axis();
    }

    @Test
    public void printTest() {
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.print("+");
        System.out.print("-");
        System.out.print("-");
        System.out.print("-");
    }

    @Test
    public void 값조절() {
        assertThat(24).isEqualTo(axis.decreaseY());
        assertThat(0).isEqualTo(axis.increaseX());
    }

    @Test
    public void printY() {
         axis.printY();
    }

    @Test
    public void printX() {
        axis.printY();
        axis.printX();
    }

    @Test
    public void axisFormat() {
        System.out.println(axis.axisFormatY(22));
        System.out.println(axis.axisFormatY(21));
    }

}