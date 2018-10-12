package coordinate.domain;

import coordinate.CoordinateMain;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinatePlaneTest {
    @Test
    public void 좌표2개입력() {
        CoordinatePlane c = new CoordinatePlane();
        ArrayList<Coordinate> p = c.enterCoordinates("(10,10)-(14,15)");
        assertThat(p.size()).isEqualTo(2);
    }
    @Test
    public void 좌표3개입력() {
        CoordinatePlane c = new CoordinatePlane();
        ArrayList<Coordinate> p = c.enterCoordinates("(10,10)-(14,15)-(1,1)");
        assertThat(p.size()).isEqualTo(3);
    }
    @Test
    public void 좌표1개입력() {
        CoordinatePlane c = new CoordinatePlane();
        ArrayList<Coordinate> p = c.enterCoordinates("(1,1)");
        assertThat(p.size()).isEqualTo(1);
    }
}
