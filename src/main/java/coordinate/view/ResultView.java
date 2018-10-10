package coordinate.view;

import coordinate.dto.CoordinateResult;

public class ResultView {
    private static final String LINE_LENGTH_MESSAGE = "두 점 사이 거리는 ";
    private static final String RECTANGLE_AREA_MESSAGE = "사각형 넓이는  ";
    private static final String RE_ENTER_MESSAGE = "0~24 까지의 유효한 값으로 다시 입력해주세요.";
    private static final String RE_ENTER_RECTANGLE_MESSAGE = "직사각형이 아닙니다. 유효한 값으로 다시 입력해주세요.";

    public static void draw(CoordinateResult result){
        StringBuilder sb = CoordinateGenerator.initCoordinate();
        CoordinateHandler.showPoint(sb, result);
    }


    public static void printReEnterMessage(String message){
        if(message == null) {
            System.out.println(RE_ENTER_MESSAGE);
            return;
        }
        if(message == "RectangleException"){
            System.out.println(RE_ENTER_RECTANGLE_MESSAGE );
            return;
        }
    }

    public static void showLineLength(double lineLength) {
        System.out.println(LINE_LENGTH_MESSAGE + lineLength);
    }

    public static void showRectangleArea(int area) {
        System.out.println(RECTANGLE_AREA_MESSAGE + area);
    }
}
