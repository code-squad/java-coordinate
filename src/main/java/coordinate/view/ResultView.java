package coordinate.view;

import com.google.common.collect.Lists;
import coordinate.domain.Line;
import coordinate.domain.Point;

import java.util.ArrayList;
import java.util.List;

public class ResultView {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int MAX_POSITION = 24;
    private static StringBuilder sb = new StringBuilder();

    private static final String VERTICAL = "|";
    private static final String SPACE = " ";
    private static final String PLUS = "+";
    private static final String HYPHEN = "-";
    private static final String FORMATTER = "%2s";
    private static final String LINE_LENGTH_MESSAGE = "두 점 사이 거리는 ";

    public static void showCoordinate(List<Point> points){
        for (Point point : points) {
            showPoint(point);
        }
    }

    public static void showLineLength(Line line){
        System.out.println(LINE_LENGTH_MESSAGE + line.length());
    }

    public static void showPoint(Point point){

    }

//    public static void showCoordinate(List<Line> lines) {
//        makePrintLines(lines);
//        for (Line line : Lists.reverse(lines)) {
//            System.out.println(lineToString(line));
//        }
//    }
//
//    public static String lineToString(Line line){
//        sb.setLength(0);
//        List<String> points = l
// ine.getPoints();
//        for (String point : points) {
//            sb.append(point);
//        }
//        return sb.toString();
//    }
//
//
//    public static void makePrintLines(List<Line> lines) {
//        makeZeroPoints(lines.get(ZERO).getPoints());
//        for (int i = ONE; i <= Coordinate.MAX_POSITION; i++) {
//            makePrintPoints(i, lines.get(i).getPoints());
//        }
//        Line horizonLine = new Line(makeHorizon());
//        lines.add(ZERO, horizonLine);
//    }
//
//    public static void makePrintPoints(int index, List<String> points){
//        points.add(ZERO, decidePrintNumber(index) + VERTICAL);
//    }
//
//    public static void makeZeroPoints(List<String> points){
//        points.add(String.format(FORMATTER, SPACE));
//        points.add(PLUS);
//        for (int i = ONE; i <= Coordinate.MAX_POSITION; i++) {
//            points.add(String.format(FORMATTER, HYPHEN));
//        }
//    }
//
    private static List<String> makeHorizon(){
        List<String> horizon = new ArrayList<>();
        for(int i = ZERO; i <= MAX_POSITION; i++){
            horizon.add(decidePrintNumber(i));
        }
        return horizon;
    }

    private static boolean isEven(int number){
        return number % TWO == ZERO;
    }

    private static String decidePrintNumber(int number){
        return isEven(number) ? String.format(FORMATTER, number) : String.format(FORMATTER, SPACE);
    }

}
