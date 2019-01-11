package coordinates;

import coordinates.domain.Line;
import coordinates.domain.Point;
import coordinates.domain.Rectangle;
import coordinates.util.SplitUtil;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class MainControllerUtil {
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

    public List<Integer> inputNumber(String input) {
        //Scnner 입력값 객체 상속 받아 List로 변환
        return SplitUtil.changeNum(input);
    }

    public List<Point> objectCoordinates(String input) {
        //point 객체 생성
        List<Point> coordinates = new ArrayList<>();
        for (int i = 0; i < inputNumber(input).size(); i = i + TWO) {
            coordinates.add(new Point(inputNumber(input).get(i), inputNumber(input).get(i + ONE)));
        }
        return coordinates;
    }

    public List<Point> alignmentNumber(String input){
        List<Point> sortPoint = objectCoordinates(input);
        Collections.sort(sortPoint);
        return sortPoint;
    }

    public Line createLine(List<Point> points, int i) {
        return new Line(points.get(i), points.get(i+ONE));
    }

    public List<Line> objectLines(List<Point> points){
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < points.size() / TWO ; i++) {
            lines.add(createLine(points, i));
        }
        return lines;
    }

    public double getMathPoint(Line line) {
        return line.mathPoint();
    }

    public boolean lineSize(List<Line> lines){
        return lines.size() < 2;
    }
}
