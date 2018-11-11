package coordinate.domain;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class LineTest {
    Line line;

    @Before
    public void setUp() {
        List<Point> coordinates = Arrays.asList(Point.ofXY(1,1), Point.ofXY(2,2));
        line = Line.ofCoordinate(coordinates);
    }

    @Test
    public void getLineLengthTest() {
        assertEquals(1.4142, line.getLineLength(), 0.0001);
    }

}
