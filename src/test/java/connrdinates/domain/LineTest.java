package connrdinates.domain;

import connrdinates.util.MainControllerUtil;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class LineTest {
    private static final String a = "(5,7)-(5,17)";
    private static final String b = "(10,10)-(14,15)";

    @Test
    public void valid() {
        List<Point> point = MainControllerUtil.alignmentNumber(a);
        Figure line = new Line(point);
    }


    @Test
    public void area() {
        List<Point> point = MainControllerUtil.alignmentNumber(b);
        Figure line = new Line(point);
        assertThat(line.area()).isEqualTo(6.4031242374328485);

    }
}