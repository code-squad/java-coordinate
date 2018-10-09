import domain.Point;
import domain.PointFactory;
import org.junit.Test;
import util.PointException;

import static org.assertj.core.api.Assertions.assertThat;

public class PointFactoryTest {
    private static final String text = "(1,2)";
    /*  포인터 생성 테스트 */
    @Test
    public void create() throws Exception {
        assertThat(PointFactory.create(text)).isEqualTo(new Point(1,2));
    }

    /* 0 <= Point.x <= 24 테스트 */
    @Test
    public void isValidTest() throws PointException {
        assertThat(PointFactory.isValid(24)).isTrue();
    }

    @Test
    public void splitTextTest() {
        assertThat(PointFactory.splitText("1,2", 0)).isEqualTo("1");
    }

    @Test
    public void removeChar() {
        assertThat(PointFactory.removeChar(text)).isEqualTo(" 1,2 ");
    }


}
