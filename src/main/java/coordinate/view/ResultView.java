package coordinate.view;

import coordinate.domain.Line;
import coordinate.domain.Point;
import coordinate.domain.Rectangle;

import java.util.List;

public class ResultView {
    private static final String LINE_LENGTH_MESSAGE = "두 점 사이 거리는 ";
    private static final String RE_ENTER_MESSAGE = "0~24 까지의 유효한 값으로 다시 입력해주세요.";

    private static final String POINT_SYMBOL = "*";
    private static final int SIZE_OF_LINE = 52;
    private static final int MAX_POSITION = 24;
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;

    public static void draw(List<Point> points){
        StringBuilder sb = CoordinateGenerator.initCoordinate();
        showPoint(sb, points);
    }

    public static void showLineLength(Line generateLine) {
        System.out.println(LINE_LENGTH_MESSAGE + generateLine.length());
    }

    public static void printReEnterMessage(){
        System.out.println(RE_ENTER_MESSAGE);
    }

    private static void showPoint(StringBuilder sb, List<Point> points){
        for (Point point : points) {
            insertPoint(sb, point);
        }
        System.out.println(sb.toString());
    }

    private static void insertPoint(StringBuilder sb, Point point){
        int location = calculatePointLocation(point);
        deletePlaceHolder(sb, location);
        sb.insert(location, POINT_SYMBOL);
    }

    private static void deletePlaceHolder(StringBuilder sb, int location){
        sb.delete(location, location + ONE);
    }

    private static int calculatePointLocation(Point point){
        int x = calculateLocationX(point.getPositionX());
        int y = calculateLocationY(point.getPositionY());
        return x + y;
    }

    private static int calculateLocationX(int positionX) {
        if(isZero(positionX)){
            return TWO;
        }
        return positionX * TWO + ONE;
    }

    private static int calculateLocationY(int positionY) {
        return (MAX_POSITION - positionY) * SIZE_OF_LINE;
    }

    private static boolean isZero(int number){
        return number == ZERO;
    }

    public static void showRectangleArea(Rectangle generateRectangle) {
    }
}
