package coordinate.domain;

import coordinate.util.InputException;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class PointPlaneTest {
    @Test
    public void 좌표2개입력() {
        CoordinatePlane c = new CoordinatePlane();
        ArrayList<Point> p = c.enterPoints("(10,10)-(14,15)");
        assertThat(p.size()).isEqualTo(2);
    }
    @Test
    public void 좌표3개입력() {
        CoordinatePlane c = new CoordinatePlane();
        ArrayList<Point> p = c.enterPoints("(10,10)-(14,15)-(1,1)");
        assertThat(p.size()).isEqualTo(3);
    }
    @Test
    public void 좌표1개입력() {
        CoordinatePlane c = new CoordinatePlane();
        ArrayList<Point> p = c.enterPoints("(1,1)");
        assertThat(p.size()).isEqualTo(1);
    }

    @Test
    public void checkDuplicate() {
        CoordinatePlane c = new CoordinatePlane();
        ArrayList<Point> p = c.enterPoints("(10,10)-(14,15)-(1,1)");
        try {
            c.checkDuplicate(p);
        } catch (InputException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = coordinate.util.InputException.class)
    public void checkDuplicate중복() {
        CoordinatePlane c = new CoordinatePlane();
        ArrayList<Point> p = c.enterPoints("(10,10)-(10,10)-(1,1)");
    }
}
