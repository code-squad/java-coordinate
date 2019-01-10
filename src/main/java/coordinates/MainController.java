package coordinates;

import coordinates.domain.Point;
import coordinates.util.MainControllerUtil;
import coordinates.view.InputView;
import coordinates.view.ResultView;
import org.slf4j.Logger;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class MainController {
    private static final int ZERO = 0;
    private static final Logger log = getLogger(MainController.class);

    private static MainControllerUtil mainControllerUtil = new MainControllerUtil();

    public static void main(String[] args) {
        String inputPoint = InputView.pointInput();
        List<Integer> axiss = mainControllerUtil.axisNum();
        List<Integer> reversalAxis = mainControllerUtil.reversalAxisNum();
        List<Point> points = mainControllerUtil.objectCoordinates(inputPoint);

        ResultView.graphWidthLin(points, reversalAxis, axiss);
        System.out.print(String.format("%3d", ZERO));
        ResultView.height(axiss);

        ResultView.mathLine(mainControllerUtil.getMathPoint(mainControllerUtil.objectLine(points)));
    }
}
