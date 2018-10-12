package coordinate.view;

import coordinate.dto.CoordinateResult;

import java.util.HashMap;
import java.util.Map;

public class ResultView {
    private static final String LINE_LENGTH_MESSAGE = "두 점 사이 거리는 ";
    private static final String RECTANGLE_AREA_MESSAGE = "사각형 넓이는  ";
    private static final String ENTER_MESSAGE = "좌표를 입력하세요.";
    private static final String RE_ENTER_MESSAGE = "0~24 까지의 유효한 값으로 다시 입력해주세요.";
    private static final String RE_ENTER_RECTANGLE_MESSAGE = "직사각형이 아닙니다. 유효한 값으로 다시 입력해주세요.";
    private static final String RE_ENTER_TRIANGLE_MESSAGE = "삼각형 성립 조건이 아닙니다. 유효한 값으로 다시 입력해주세요.";
    private static final String TRIANGLE_AREA_MESSAGE = "삼각형의 넓이는 ";
    private static final String RE_ENTER_DUPLICATION_MESSAGE = "위치가 같은 점(point)이 존재합니다. 세 점의 위치는 달라야 합니다.";


    public static void draw(CoordinateResult result){
        StringBuilder sb = CoordinateGenerator.initCoordinate();
        CoordinateHandler.showPoint(sb, result);
    }

    public static void printEnterMessage(){
        System.out.println(ENTER_MESSAGE);
    }

    public static void printReEnterMessage(String message){
        System.out.println(exceptionMessageMapper(message));
    }

    private static String exceptionMessageMapper(String message){
        Map<String, String> messageMap = new HashMap<>();
        messageMap.put(null, RE_ENTER_MESSAGE);
        messageMap.put("RectangleException", RE_ENTER_RECTANGLE_MESSAGE);
        messageMap.put("TriangleException", RE_ENTER_TRIANGLE_MESSAGE);
        messageMap.put("DuplicationException", RE_ENTER_DUPLICATION_MESSAGE);
        return messageMap.get(message);
    }

    private static String figureMessageMapper(String figureName){
        Map<String, String> messageMap = new HashMap<>();
        messageMap.put("Line", LINE_LENGTH_MESSAGE);
        messageMap.put("Triangle", TRIANGLE_AREA_MESSAGE);
        messageMap.put("Rectangle", RECTANGLE_AREA_MESSAGE);
        return messageMap.get(figureName);
    }

    public static void showFigureArea(String name, double area) {
        System.out.println(figureMessageMapper(name));
        System.out.println(area);
    }
}
