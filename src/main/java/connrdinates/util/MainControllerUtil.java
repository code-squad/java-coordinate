package connrdinates.util;

import connrdinates.domain.Line;
import connrdinates.domain.Point;
import connrdinates.domain.Rectangle;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class MainControllerUtil {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    private static final Logger log = getLogger(MainControllerUtil.class);

    public static List<Integer> inputNumber(String input) {
        //Scnner 입력값 객체 상속 받아 List로 변환
        return SplitUtil.changeNum(input);
    }

    public static List<Point> objectCoordinates(String input) {
        //point 객체 생성
        List<Point> coordinates = new ArrayList<>();
        for (int i = 0; i < inputNumber(input).size(); i = i + TWO) {
            coordinates.add(new Point(inputNumber(input).get(i), inputNumber(input).get(i + ONE)));
        }
        return coordinates;
    }

    public static List<Point> alignmentNumber(String input) {
        List<Point> sortPoint = objectCoordinates(input);
        Collections.sort(sortPoint);
        return sortPoint;
    }


}
