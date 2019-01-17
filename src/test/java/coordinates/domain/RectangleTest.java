package coordinates.domain;

import coordinates.util.MainControllerUtil;
import coordinates.util.SplitUtil;
import org.junit.Test;
import org.slf4j.Logger;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.*;
import static org.slf4j.LoggerFactory.getLogger;

public class RectangleTest {

    private static MainControllerUtil mainControllerUtil;
    private static final Logger log = getLogger(RectangleTest.class);
    private static String a = "(10,10)-(22,10)-(22,18)-(10,18)";

    @Test
    public void formY() {
        Point p1 = new Point(10,18);
        Point p2 = new Point(22,18);
        Point p3 = new Point(10,10);
        Point p4 = new Point(22,10);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);

        Rectangle rectangle = new Rectangle(l1, l2);

        assertThat(rectangle.formY()).isEqualTo(true);
    }

    @Test
    public void formX() {
        Point p1 = new Point(10,18);
        Point p2 = new Point(22,18);
        Point p3 = new Point(10,10);
        Point p4 = new Point(22,10);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);

        Rectangle rectangle = new Rectangle(l1, l2);

        assertThat(rectangle.formX()).isEqualTo(true);

    }

    @Test
    public void rectngleException() {
        Point p1 = new Point(10,18);
        Point p2 = new Point(22,18);
        Point p3 = new Point(10,10);
        Point p4 = new Point(22,10);

        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3, p4);

        Rectangle rectangle = new Rectangle(l1, l2);

        assertThat(rectangle.rectngleException()).isEqualTo(true);

    }
}