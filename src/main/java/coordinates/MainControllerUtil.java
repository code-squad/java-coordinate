package coordinates;

import com.sun.xml.internal.bind.v2.runtime.Coordinator;
import coordinates.domain.Point;
import coordinates.util.SplitUtil;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class MainControllerUtil extends SplitUtil {

    private static final int LAST_NUMBER = 24;
    private static final int OBJECT_SIZE = 2;
    private static final int OBJECT_NUM = 1;

    private static final Logger log = getLogger(MainControllerUtil.class);

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
        return axis%2 == 0;
    }

    public int getAxisSize() {
        return axisNum().size();
    }

    public int getAxis(List<Integer> axis, int i) {
        return axis.get(i);
    }

    public int getReversalAxis(int i) {
        return reversalAxisNum().get(i);
    }

    public List<Integer> inputNumber (String input){
        return super.changeNum(input);
    }

    public List<Point> objectCoordinates(String input){
        List<Point> coordinates = new ArrayList<>();
        for (int i = 0; i < inputNumber(input).size(); i= i+OBJECT_SIZE) {
            coordinates.add(new Point(inputNumber(input).get(i), inputNumber(input).get(i+1)));
        }
        return coordinates;
    }

    public Point splitCoordinate(int i, String input){
       return objectCoordinates(input).get(i);
    }

    public double mathPoint(String input){
        //이거 확인할 것
        return splitCoordinate(0, input).getMath(splitCoordinate(OBJECT_NUM, input));
    }

    public boolean pointConditionX(Point point, int i) {
        return point.getObjectX(i) == true;
    }

    public boolean pointConditionY(Point point, int i) {
        return point.getObjectY(i) == true;
    }


}
