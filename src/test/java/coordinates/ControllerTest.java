package coordinates;

import org.junit.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ControllerTest {

    private Controller controller = new Controller();

    @Test
    public void axisNum() {
        List<Integer> a = controller.axisNum();

        assertThat(a.size()).isEqualTo(24);
    }

    @Test
    public void reversalAxisNum() {
        List<Integer> a = controller.reversalAxisNum();

        assertThat(a.get(0)).isEqualTo(24);
    }

    @Test
    public void okBlankCondition() {
        int i = 1;
         assertThat(controller.blankCondition(i)).isEqualTo(true);
    }

    @Test
    public void noBlankCondition() {
        List<Integer> a = controller.axisNum();
        int i = 0;
         assertThat(controller.blankCondition(i)).isEqualTo(false);
    }

}