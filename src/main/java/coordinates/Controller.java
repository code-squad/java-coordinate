package coordinates;

import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class Controller {

    private static final Logger log = getLogger(Controller.class);

    private static final int LAST_NUMBER = 24;

    public List<Integer> axisNum() {
        List<Integer> axis = new ArrayList<>();
        for (int i = 1; i <= LAST_NUMBER; i++) {
            axis.add(i);
        }
        return axis;
    }

    public List<Integer> reversalAxisNum() {
        List<Integer> reversalAxis = axisNum();
        Collections.reverse(reversalAxis);

        return reversalAxis;
    }

    public boolean blankCondition(int axis) {
        if (axis % 2 != 0) {
            return false;
        }
        return true;
    }

    public int getAxisSize() {
        return axisNum().size();
    }

    public int getAxis(List<Integer> axis, int i) {
        return axis.get(i);
    }

    public int getReversalAxis(List<Integer> reversalAxis, int i) {
        return reversalAxisNum().get(i);
    }
}
