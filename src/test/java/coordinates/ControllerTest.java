package coordinates;

import org.junit.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ControllerTest {

    private Controller controller = new Controller();

    @Test
    public void axisNum() {
        List<Integer> axisNum = controller.axisNum();

        assertThat(axisNum.size()).isEqualTo(24);
    }

    @Test
    public void reversalAxisNum() {
        List<Integer> reversalAxisNum = controller.reversalAxisNum();

        assertThat(reversalAxisNum.get(0)).isEqualTo(24);
    }

    @Test
    public void okBlankCondition() {
        int i = 1;
         assertThat(controller.blankCondition(i)).isEqualTo(true);
    }

    @Test
    public void noBlankCondition() {
        List<Integer> axisNum = controller.axisNum();
        int i = 0;
         assertThat(controller.blankCondition(i)).isEqualTo(false);
    }

}