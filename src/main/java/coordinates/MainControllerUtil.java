package coordinates;

import coordinates.domain.Line;
import coordinates.domain.Point;
import coordinates.util.SplitUtil;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class MainControllerUtil extends SplitUtil {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    private static final Logger log = getLogger(MainControllerUtil.class);

    public List<Integer> axisNum() {
        //List 1~24까지 숫자 넣기
        List<Integer> axis = new ArrayList<>();
        for (int i = 1; i <= 24; i++) {
            axis.add(i);
        }
        return axis;
    }

    public List<Integer> reversalAxisNum() {
        //List에 1~24를 24~1로 자리수 변환하기
        List<Integer> reversalAxis = axisNum();
        Collections.reverse(reversalAxis);

        return reversalAxis;
    }

    public boolean blankCondition(int axis) {
        //1~24까지의 %2는 true
        return axis % 2 == 0;
    }

    public int getAxisSize() {
        //numListSize 구하기
        return axisNum().size();
    }

    public int getAxis(List<Integer> axis, int i) {
        //특정 ListNum 구하기
        return axis.get(i);
    }

    public List<Integer> inputNumber(String input) {
        //Scnner 입력값 객체 상속 받아 List로 변환
        return super.changeNum(input);
    }

    public List<Point> objectCoordinates(String input) {
        //point 객체 생성
        List<Point> coordinates = new ArrayList<>();
        for (int i = 0; i < inputNumber(input).size(); i = i + TWO) {
            coordinates.add(new Point(inputNumber(input).get(i), inputNumber(input).get(i + ONE)));
        }
        return coordinates;
    }

    public Line objectLine(List<Point> points) {
        return new Line(points.get(ZERO), points.get(ONE));
    }

    public double getMathPoint(Line line) {
        return line.mathPoint();
    }
}
