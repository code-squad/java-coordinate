package coordinates;

import coordinates.domain.Point;
import coordinates.view.ResultView;
import org.slf4j.Logger;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class Controller {

    private MainControllerUtil mainControllerUtil = new MainControllerUtil();
    private ResultView resultView = new ResultView();
    private List<Integer> axiss = mainControllerUtil.axisNum();
    private static final int START_NUM = 0;

    private static final Logger log = getLogger(Controller.class);

    public void main() {
        int axisSize = mainControllerUtil.getAxisSize();
        width(axisSize);
        System.out.print(String.format("%3d", START_NUM));
        height(axisSize);

    }

    private void height(int axisSize) {
        for (int i = 0; i < axisSize; i++) {
            int axis = mainControllerUtil.getAxis(axiss, i);
            resultView.graphHeightLine(axis, blankCondition(axis));
        }
        System.out.println();
    }

    private void width(int axisSize) {
        for (int i = 0; i < axisSize; i++) {
            int reversalAxis = mainControllerUtil.getReversalAxis(i);
            resultView.graphWidthLine(reversalAxis, blankCondition(reversalAxis));
            mainControllerUtil.blankCondition(axisSize);
        }
    }

    // TODO: 2019-01-07 height, width + objectPoint => 출력

    private boolean blankCondition(int axis) {
        return mainControllerUtil.blankCondition(axis);
    }

    public void a(Point point, int i) {

    }




}
