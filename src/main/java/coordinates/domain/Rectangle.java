package coordinates.domain;

import org.slf4j.Logger;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class Rectangle extends Exception {

    private Line line; //point.get(0), point.get(1)
    private Line distinctLine; //point.get(2), point.get(3)
    private static final Logger log = getLogger(Rectangle.class);

    public Rectangle(Line line, Line distinctLine) {
        this.line = line;
        this.distinctLine = distinctLine;

//        try {
//
//        }catch (Exception e){
//            System.out.println("잘못된 좌표입니다. 다시 입력하세요.");
//        }
    }

    public boolean formX() {
        log.debug("X:{}", line.getLineFormX(distinctLine));
        return line.getLineFormX(distinctLine) == true;
    }

    public boolean formY() {
        return (line.getLineFormY() == true) && (distinctLine.getLineFormY() == true);
    }

    public boolean rectngleException() {
        if((formY() != true) && (formX() != true)){
            throw new IllegalArgumentException();
        }
        return true;
    }

//    public double area(Line line){
//        return line.mathPoint() * mathPoint();
//    }

    private void rectangleTwoLine(List<Point> points, int reversalAxis, List<Integer> axis) {
        for (int k = 0; k < points.size(); k = k + 2) {
            for (int j = 0; j < 24; j++) {
//                rectangleOneLine(points, reversalAxis, axis.get(j), k);
            }
        }
    }

    public boolean rectangleOneLineY(List<Point> points, int reversalAxis, int k) {
        return points.get(k).getY() == reversalAxis && points.get(k + 1).getY() == reversalAxis;
    }

    public boolean rectangleOneLineX(List<Point> points, int axis, int k) {
        return points.get(k).getX() == axis || points.get(k + 1).getX() == axis;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "line=" + line +
                ", distinctLine=" + distinctLine +
                '}';
    }
}
