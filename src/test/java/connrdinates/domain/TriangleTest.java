package connrdinates.domain;
import connrdinates.util.MainControllerUtil;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TriangleTest {
    private static final String a = "(10,10)-(14,15)-(20,8)";


    @Test
    public void area() {
        List<Point> point = MainControllerUtil.alignmentNumber(a);
        Triangle triangle = new Triangle(point);

        assertThat(triangle.area()).isEqualTo(28.999999999999996);
    }

    @Test
    public void valid(){
        List<Point> point = MainControllerUtil.alignmentNumber(a);
        Triangle triangle = new Triangle(point);

        assertThat(triangle.valid()).isEqualTo(true);
    }

    @Test
    public void crite(){
        List<Point> point = MainControllerUtil.alignmentNumber(a);
        Figure figure = new Triangle(point);
    }
}