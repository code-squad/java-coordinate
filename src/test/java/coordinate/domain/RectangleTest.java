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
}
