package connrdinates.view;

import connrdinates.domain.Figure;
import connrdinates.domain.Point;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class ResultView {

    private static final String STICK = "｜";
    private static final String HORIZONTAL = "-";
    private static final String POINT = "ㆍ";
    private static final String BLANK = " ";
    private static final Logger log = getLogger(ResultView.class);

    private static List<Integer> axisNum() {
        //List 1~24까지 숫자 넣기
        List<Integer> axis = new ArrayList<>();
        for (int i = 1; i <= 24; i++) {
            axis.add(i);
        }
        return axis;
    }

    private static List<Integer> reversalAxisNum() {
        //List에 1~24를 24~1로 자리수 변환하기
        List<Integer> reversalAxis = axisNum();
        Collections.reverse(reversalAxis);

        return reversalAxis;
    }

    public static void graphWidthLine(List<Point> points) {
        for (int i = 0; i < 24; i++) {
            blankNumber(reversalAxisNum().get(i));
            StringBuilder stringBuilder = new StringBuilder();
            twoPointLine(points, i, stringBuilder);
            System.out.println(stringBuilder);
        }
    }

    private static void twoPointLine(List<Point> points, int i, StringBuilder stringBuilder) {
        int preX = 0;
        for (Point point : points) {
            if (point.checkY(reversalAxisNum().get(i))) {
                preX = onePointLine(stringBuilder, preX, point);
            }
        }
    }

    private static int onePointLine(StringBuilder stringBuilder, int preX, Point point) {
        for (int j = preX; j < point.getX(); j++) {
            String input= BLANK;
            if(point.checkX(axisNum().get(j))){
                input = POINT;
                preX = point.getX();
            }
            stringBuilder.append(input);
        }
        return preX;
    }

    private static void blankNumber(int reversalAxis) {
        String blank = " ";
        if(blankCondition(reversalAxis) == true){
            blank = Integer.toString(reversalAxis);
        }
        System.out.print(String.format("%2s", blank));
        System.out.print(STICK);
    }

    public static void height() {
        System.out.print(String.format("%3s", "0"));
        for (int i = 0; i < axisNum().size(); i++) {
            int axis = axisNum().get(i);
            graphHeightLine(axis, blankCondition(axisNum().get(i)));
        }
        System.out.println();
    }

    public static void graphHeightLine(int axis, boolean blank) {
        String input = BLANK;
        if (blank == true) {
            input = String.valueOf(axis);
            System.out.print(HORIZONTAL);
            System.out.print(HORIZONTAL);
            System.out.print(input);
        }
    }

    public static boolean blankCondition(int axis) {
        //1~24까지의 %2는 true
        return axis % 2 == 0;
    }

    public static void area(Figure figure){
        String input = "의 넓이는 ";
        if(figure.name().equals("Line")){
            input = "의 거리는 ";
        }
        System.out.println(figure.name() + input + figure.area());
    }
}
