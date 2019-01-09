package coordinates;

import coordinates.domain.Point;
import coordinates.view.InputView;
import coordinates.view.ResultView;
import org.slf4j.Logger;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class Controller {

    private static final int ZERO = 0;
    private static final Logger log = getLogger(Controller.class);

    private MainControllerUtil mainControllerUtil = new MainControllerUtil();
    private ResultView resultView = new ResultView();

    private String inputPoint = InputView.pointInput();
    private List<Integer> axiss = mainControllerUtil.axisNum();
    private List<Integer> reversalAxis = mainControllerUtil.reversalAxisNum();
    private List<Point> points = mainControllerUtil.objectCoordinates(inputPoint);
    private int axisSize = mainControllerUtil.getAxisSize();


    public void main() {
        resultView.graphWidthLin(points, reversalAxis, axiss);
        System.out.print(String.format("%3d", ZERO));
        height(axisSize);

        resultView.mathLine(mainControllerUtil.getMathPoint(mainControllerUtil.objectLine(points)));
    }

    private void height(int axisSize) {
        for (int i = 0; i < axisSize; i++) {
            int axis = mainControllerUtil.getAxis(axiss, i);
            resultView.graphHeightLine(axis, blankCondition(axis));
        }
        System.out.println();
    }

    private boolean blankCondition(int axis) {
        return mainControllerUtil.blankCondition(axis);
    }
}
