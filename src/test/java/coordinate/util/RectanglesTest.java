package coordinate.util;

import coordinate.domain.Coordinate;
import coordinate.domain.CoordinatePlane;
import coordinate.domain.Rectangles;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class RectanglesTest {
    @Test
    public void 사각형넓이구하기() {
        ArrayList<Coordinate> c = CoordinatePlane.enterCoordinates("(10,10)-(22,10)-(22,18)-(10,18)");
        Rectangles r = null;
        try {
            r = new Rectangles(c);
        } catch (InputException e) {
            e.printStackTrace();
        }

        double result = r.getArea();
        assertThat(result).isEqualTo(96.0);
    }

    @Test
    public void 한라인위에x축두점() {

        ArrayList<Coordinate> c = CoordinatePlane.enterCoordinates("(10,10)-(22,10)-(22,18)-(10,18)");
        Rectangles r = null;
        try {
            r = new Rectangles(c);
        } catch (InputException e) {
            e.printStackTrace();
        }

        Boolean result = r.isSameXLine(c);
        assertThat(result).isTrue();
    }

    @Test
    public void 한라인위에y축두점() {
        ArrayList<Coordinate> c = CoordinatePlane.enterCoordinates("(10,10)-(10,18)-(22,10)-(22,18)");
        Rectangles r = null;
        try {
            r = new Rectangles(c);
        } catch (InputException e) {
            e.printStackTrace();
        }

        Boolean result = r.isSameYLine(c);
        assertThat(result).isTrue();
    }
}
