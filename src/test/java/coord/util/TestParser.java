package coord.util;

import coord.domain.Point;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestParser {
    @Test
    public void parseTest(){
        List<Point> points = Parser.parseToPoints("(10,10)-(14,15)");
        List<Point> expected = new ArrayList<>();
        expected.add(Point.of(10, 10));
        expected.add(Point.of(14, 15));
        assertThat(expected).isEqualTo(points);
    }
}
