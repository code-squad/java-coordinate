package coordinates.util;

import coordinates.domain.Line;
import coordinates.domain.Point;
import coordinates.domain.Rectangle;
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

    public List<Point> alignmentNumber(String input) {
        List<Point> sortPoint = objectCoordinates(input);
        Collections.sort(sortPoint);
        return sortPoint;
    }

    public Line createLine(List<Point> points) {
        return new Line(points.get(ZERO), points.get(ONE));
    }

    public Rectangle createRectangle(List<Point> points){
        List<Line> lines = new ArrayList<>();
        for (int i = 0; i < points.size(); i= i+2) {
             lines.add(new Line(points.get(i), points.get(i+ONE)));
        }

        log.debug("라인:{}",lines);

        return new Rectangle(lines.get(0), lines.get(1));
    }

    public Object figure(List<Point> points){
        log.debug("호에에:{}",sizeCheck(points));
        if(sizeCheck(points) == true){
            Rectangle r = createRectangle(points);
            return r;
            //return createRectangle(points);
        }
        return createLine(points);
    }

    public double widthLength(List<Point> points) {
        List<Point> input = new ArrayList<>();

        for (int i = TWO; i < points.size(); i++) {
            if (points.get(0).getX() == points.get(i).getX()) {
                input.add(points.get(i));
            }
        }
        Line line = new Line(points.get(0), input.get(0));

        return createLine(points).area(line);
    }

    public boolean sizeCheck(List<Point> points) {
        log.debug("ㅇㅇㅇㅇ사이즈:{}", points.size());
        return points.size() > 2;
    }

    public double areaAndLength(List<Point> points) {
        if (sizeCheck(points) == true) {
            return widthLength(points);
        }
        return lengeth(points);
    }

    public double lengeth(List<Point> points) {
        return createLine(points).mathPoint();
    }
}
