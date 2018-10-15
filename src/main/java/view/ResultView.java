package view;

import domain.*;
import dto.ResultDto;
import util.PointException;

import java.util.HashMap;
import java.util.Map;

public class ResultView {
    public static final String DOT_IMAGE = "()";
    private static Map<Integer, String> messageMap = new HashMap<>();

    static {
        messageMap.put(2, "두 점 사이의 거리는 : ");
        messageMap.put(3, "삼각형의 넓이는 : ");
        messageMap.put(4, "사각형의 넓이는 : ");
    }

    private ResultView() {

    }

    public static void printDistance(ResultDto resultDto)  {
        System.out.println(String.format("%s : %5f",messageMap.get(resultDto.getCountOfPoint()) , resultDto.getValue()));
    }

    public static void drawAxis(ResultDto resultDto) {
        drawYaxis(resultDto);
        drawXaxis();
    }
    private static void drawYaxis(ResultDto resultDto) {
        for (int i = Point.MAX_SIZE; i > 0; i--) {
            AxisView.printVerticalAxisNum(i);
            AxisView.printVerticalAxisBar();
            printPoints(resultDto, i, initLine());
        }
    }

    private static String initLine() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Point.MAX_SIZE; i++) {
            sb.append(AxisView.BLANK);
        }
        return sb.toString();
    }

    private static void printPoints(ResultDto resultDto, int index, String line) {
        for (int i = 0; i <= Point.MAX_SIZE; i++) {
            line = printLine(i, index, resultDto, line);
        }
        System.out.println(line);
    }

    private static String printLine(int xIndex, int yIndex, ResultDto resultDto, String line) {
        for(Point point : resultDto.getPoints()) {
            line = printDots(xIndex, yIndex, point, line);
        }
        return line;
    }

    private static String printDots(int xIndex, int yIndex, Point point, String line) {
        if(point.isDot(xIndex, yIndex)) {
            line = line.substring(0, (xIndex - 1) * DOT_IMAGE.length()) + DOT_IMAGE + line.substring(xIndex * DOT_IMAGE.length());
        }
        return line;
    }

    private static void drawXaxis() {
        AxisView.printHorizontalAxisBar();
        AxisView.printHorizontalAxisNum();

    }
}
