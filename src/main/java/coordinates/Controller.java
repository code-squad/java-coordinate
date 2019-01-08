package coordinates;

import coordinates.domain.Point;
import coordinates.view.InputView;
import coordinates.view.ResultView;
import jdk.internal.util.xml.impl.Input;
import org.slf4j.Logger;

import java.rmi.StubNotFoundException;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class Controller {

    private MainControllerUtil mainControllerUtil = new MainControllerUtil();
    private ResultView resultView = new ResultView();
    private List<Integer> axiss = mainControllerUtil.axisNum();
    private String a = InputView.pointInput();

    private static final int START_NUM = 0;

    private static final Logger log = getLogger(Controller.class);

    int axisSize = mainControllerUtil.getAxisSize();
    List<Integer> reversalAxis = mainControllerUtil.reversalAxisNum();

    public void main() {
        max();
        System.out.print(String.format("%3d", START_NUM));
        height(axisSize);
    }

    private void max() {
        List<Point> points = mainControllerUtil.objectCoordinates(a);
        String biankNum = " ";

        log.debug("ra:{}", reversalAxis);
        log.debug("a:{}", axiss);

        int num = 0;

        for (int i = 0; i < 24; i++) {

            System.out.print(String.format("%2d", reversalAxis.get(i)));
            System.out.print("｜");

            for (int k = 0; k < 2; k++) {
                if (points.get(k).getY() == reversalAxis.get(i)) {
                    for (int j = 0; j < 24; j++) {
                        if (points.get(k).getX() != axiss.get(j)) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
            }

            System.out.println();
        }
    }



    private void height(int axisSize) {
        for (int i = 0; i < axisSize; i++) {
            int axis = mainControllerUtil.getAxis(axiss, i);
            resultView.graphHeightLine(axis, blankCondition(axis));
        }
        System.out.println();
    }

    private void width(int axisSize) {
        //처리
        for (int i = 0; i < axisSize; i++) {
            int reversalAxis = mainControllerUtil.getReversalAxis(i);
//            resultView.graphWidthLine(reversalAxis, blankCondition(reversalAxis));
            mainControllerUtil.blankCondition(axisSize);
        }
    }

    // TODO: 2019-01-07 height, width + objectPoint => 출력

    private boolean blankCondition(int axis) {
        return mainControllerUtil.blankCondition(axis);
    }


}
