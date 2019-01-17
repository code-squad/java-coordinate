package coordinates.util;

import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainControllerUtilTest {

    private static MainControllerUtil mainControllerUtil;

    @Test
    public void inputNumber() {
        String a ="(1,1)-(2,2)";
        assertThat(mainControllerUtil.inputNumber(a).size()).isEqualTo(4);
    }
}