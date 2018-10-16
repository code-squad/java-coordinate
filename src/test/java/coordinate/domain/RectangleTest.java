package coordinate.domain;

import coordinate.util.InputException;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RectangleTest {
    @Test
    public void 사각형넓이구하기() {
        ArrayList<Point> c = CoordinatePlane.enterPoints("(10,10)-(22,10)-(22,18)-(10,18)");
        Rectangle r = null;
        try {
            r = new Rectangle(c);
        } catch (InputException e) {
            e.printStackTrace();
        }

        double result = r.getArea();
        assertThat(result).isEqualTo(96.0);
    }

    @Test
    public void 한라인위에x축두점() {

        ArrayList<Point> c = CoordinatePlane.enterPoints("(10,10)-(22,10)-(22,18)-(10,18)");
        Rectangle r = null;
        try {
            r = new Rectangle(c);
        } catch (InputException e) {
            e.printStackTrace();
        }

        //Boolean result = r.isSameXLine(c);
        //assertThat(result).isTrue();
    }

    @Test
    public void 한라인위에y축두점() {
        ArrayList<Point> c = CoordinatePlane.enterPoints("(10,10)-(10,18)-(22,10)-(22,18)");
        Rectangle r = null;
        try {
            r = new Rectangle(c);
        } catch (InputException e) {
            e.printStackTrace();
        }

        //Boolean result = r.isSameYLine(c);
        //assertThat(result).isTrue();
    }
}
