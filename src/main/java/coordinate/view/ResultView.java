package coordinate.view;

import coordinate.domain.Coordinate;
import coordinate.domain.Line;
import coordinate.domain.Point;

import java.util.List;

public class ResultView {
    private static final String HORIZONTAL_BAR = "|";
    private static final String VERTICAL_BAR = "--";
    private static final String STAR = "*";
    private static final String BLANK = " ";
    private static final String PLUS = "+";
    private static final String NEW_LINE= "\n";
    private static final String DOUBLE_LENGTH_FORMATTER = "%2s";
    private static final String TRIPLE_LENGTH_FORMATTER = "%3s";
    private static final String DISTANCE_MESSAGE = "두 점 사이의 거리는 ";

    private static StringBuilder sb = new StringBuilder();

    public static void printCoordinate(List<Point> coordinate, float distance) {
        printGrpah(coordinate);
        printDistance(distance);
    }

    private static void printDistance(float distance) {
        System.out.println(NEW_LINE + DISTANCE_MESSAGE + distance);
    }

    public static void printGrpah(List<Point> coordinate) {
        printYAxis(Point.MAX_SIZE, coordinate);
        printXAxis(Point.MAX_SIZE);
    }

    private static void printYAxis(int size, List<Point> coordinate) {
        sb.setLength(Coordinate.ZERO);
        for (int i = size; i > Coordinate.ZERO; i--) {
            sb.append(decidePrintYAxisNumber(i));
            printYAxisLine(i, coordinate);
        }
        System.out.println(sb.toString());
    }

    private static void printYAxisLine(int i, List<Point> coordinate) {
        sb.append(HORIZONTAL_BAR);
        for (int j = 0; j < coordinate.size(); j++) {
            printStar(i, j, coordinate);
        }
        if (i != Coordinate.ONE) sb.append(System.getProperty("line.separator"));
    }

    private static void printStar(int i, int j, List<Point> coordinate) {
        if(i == coordinate.get(j).getY()) {
            makeStarLine(j, coordinate);
        }
    }

    private static void makeStarLine(int j, List<Point> coordinate) {
        sb.append(new String(new char[coordinate.get(j).getX()* Point.TWO-Coordinate.ONE]).replace("\0", BLANK));
        sb.append(STAR);
    }

    private static String decidePrintYAxisNumber(int number) {
        if (isEven(number)) {
            return String.format(DOUBLE_LENGTH_FORMATTER, number);
        }
        return String.format(DOUBLE_LENGTH_FORMATTER, BLANK);
    }

    private static void printXAxis(int size) {
        printXAxisLine(size);
        printXAxisNumber(size);
    }

    private static void printXAxisLine(int size) {
        sb.setLength(Coordinate.ZERO);
        for (int i = 0; i <= size; i++) {
            sb.append(decidePrintXAxisLine(i));
        }
        System.out.println(sb.toString());
    }

    private static String decidePrintXAxisLine(int i) {
        return (i == Coordinate.ZERO) ? String.format(TRIPLE_LENGTH_FORMATTER, PLUS) : VERTICAL_BAR;
    }

    private static void printXAxisNumber(int size) {
        sb.setLength(Coordinate.ZERO);
        sb.append(String.format(TRIPLE_LENGTH_FORMATTER, Coordinate.ZERO + BLANK));
        for (int i = 1; i <= size; i++) {
            sb.append(decidePrintNumber(i));
        }
        System.out.println(sb.toString());
    }

    private static String decidePrintNumber(int number){
        return isEven(number) ? String.format(DOUBLE_LENGTH_FORMATTER, number) : String.format(DOUBLE_LENGTH_FORMATTER, BLANK);
    }

    private static boolean isEven(int number){
        return number % Point.TWO == Coordinate.ZERO;
    }
}