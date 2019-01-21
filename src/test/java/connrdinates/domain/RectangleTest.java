package connrdinates.domain;

import connrdinates.util.MainControllerUtil;
import org.junit.Test;
import org.slf4j.Logger;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.setLenientDateParsing;
import static org.slf4j.LoggerFactory.getLogger;

public class RectangleTest {

    private static MainControllerUtil mainControllerUtil;
    private static final Logger log = getLogger(RectangleTest.class);
    private static String a = "(10,10)-(22,10)-(22,18)-(10,18)";
    private static String b = "(7,3)-(15,3)-(2,3)-(2,3)";

    @Test
    public void sizeCheck() {
        List<Point> point = MainControllerUtil.alignmentNumber(a);
        Rectangle rectangle = new Rectangle(point);

        assertThat(rectangle.sizeCheck()).isEqualTo(true);
    }


    @Test
    public void area(){
        List<Point> point = MainControllerUtil.alignmentNumber(a);
        Rectangle rectangle = new Rectangle(point);

        assertThat(rectangle.area()).isEqualTo(96);
    }

    @Test
    public void crite(){
        List<Point> points = MainControllerUtil.alignmentNumber(a);
        Figure figure = new Rectangle(points);

        assertThat(figure.name()).isEqualTo("Rectangle");
    }

}