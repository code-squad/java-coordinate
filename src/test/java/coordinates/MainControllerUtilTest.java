package coordinates;

import coordinates.util.MainControllerUtil;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
public class MainControllerUtilTest {

    private MainControllerUtil mainControllerUtil = new MainControllerUtil();

    @Test
    public void axisNum() {
        List<Integer> a = mainControllerUtil.axisNum();
        assertThat(a.size()).isEqualTo(24);
    }

    @Test
    public void reversalAxisNum() {
        List<Integer> a = mainControllerUtil.reversalAxisNum();
        assertThat(a.get(0)).isEqualTo(24);
    }

    @Test
    public void inputNumber() {
        String a ="(1,1)-(2,2)";
        assertThat(mainControllerUtil.inputNumber(a).size()).isEqualTo(4);
    }
}