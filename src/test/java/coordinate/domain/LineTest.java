package coordinate.domain;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class LineTest {
    Line line;

    @Before
    public void setUp() {
        List<Point> coordinates = new ArrayList<>();
        coordinates.add(Point.ofXY(1,1));
        coordinates.add(Point.ofXY(2,2));

        line = Line.ofCoordinate(coordinates);
    }

    @Test
    public void getLineLength() {
        assertEquals(1.4142, line.getLineLength(), 0.0001);
    }

}
