package coordinates;

import org.slf4j.Logger;
import java.util.List;
import static org.slf4j.LoggerFactory.getLogger;

public class CoordinatesServes {

    private Controller controller = new Controller();
    private ResultView resultView = new ResultView();
    private List<Integer> axiss = controller.axisNum();
    private static final int START_NUM = 0;

    private static final Logger log = getLogger(CoordinatesServes.class);

    public void main() {
        int axisSize = controller.getAxisSize();
        width(axisSize);
        System.out.print(String.format("%3d", START_NUM));
        height(axisSize);
    }

    private void height(int axisSize) {
        for (int i = 0; i < axisSize; i++) {
            int axis = controller.getAxis(axiss, i);
            resultView.graphHeightLine(axis, blankCondition(axis));
        }
    }

    private void width(int axisSize) {
        for (int i = 0; i < axisSize; i++) {
            int reversalAxis = controller.getReversalAxis(i);
            resultView.graphWidthLine(reversalAxis, blankCondition(reversalAxis));
        }
    }

    private boolean blankCondition(int axis) {
        return controller.blankCondition(axis);
    }

}
