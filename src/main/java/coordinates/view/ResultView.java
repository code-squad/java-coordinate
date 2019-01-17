package coordinates.view;

import coordinates.domain.Point;
import coordinates.domain.Rectangle;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class ResultView {

    private static final String STICK = "｜";
    private static final String HORIZONTAL = " ";
    private static final String POINT = "ㆍ";
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
        for (int i = 0; i < axisNum().size(); i++) {
            blankNumber(reversalAxisNum().get(i));

            figureForm(points, reversalAxisNum().get(i));
            System.out.println();

            // TODO: point 2개일 경우 x축이 동일 할 경우 48번이 돌고 찍히는 경우의 수 처리해야함.
        }
    }


    private static void blankNumber(int reversalAxis) {
        String blank = " ";
        if(blankCondition(reversalAxis) == true){
            blank = Integer.toString(reversalAxis);
        }
        System.out.print(String.format("%2s", blank));
        System.out.print(STICK);
    }

//    private static void blankNumber(int i) {
//        String blank = " ";
//        if(blankCondition(reversalAxisNum().get(i)) == true){
//            blank = Integer.toString(reversalAxisNum().get(i));
//        }
//        System.out.print(String.format("%2s", blank));
//        System.out.print(STICK);
//    }

    public static void height() {
        for (int i = 0; i < axisNum().size(); i++) {
            int axis = axisNum().get(i);
            graphHeightLine(axis, blankCondition(axisNum().get(i)));
        }
        System.out.println();
    }

    public static boolean blankCondition(int axis) {
        //1~24까지의 %2는 true
        return axis % 2 == 0;
    }

    private static void figureForm(List<Point> points, int i) {
        if (figureSize(points) == true) {
            rectangleTwoLine(points, reversalAxisNum().get(i));
        } else {
            twoLine(points, reversalAxisNum().get(i));
        }
    }

    private static boolean figureSize(List<Point> point){
        return point.size() > 2;
    }

    public static void mathLine(List<Point> points, double input) {
        String message = "두 점의 길이는 : ";
        if(figureSize(points) == true){
            message = "사각형 넓이는 ";
        }
        System.out.println(message+input);
    }

    private static void twoLine(List<Point> points, int i) {
        for (int k = 0; k < 2; k++) {
            if (points.get(k).getY() == reversalAxisNum().get(i)) {
                oneLine(points.get(k), axisNum());
            }
        }
    }

    private static void oneLine(Point points, List<Integer> axis) {
        for (int j = 0; j < 24; j++) {
            String blankNum = " ";
            if (points.getX() == axis.get(j)) {
                blankNum = POINT;
            }
            System.out.print(blankNum);
        }
    }

    private static void rectangleTwoLine(List<Point> points, int reversalAxis) {
        for (int k = 0; k < points.size(); k = k + 2) {
            for (int j = 0; j < 24; j++) {
                rectangleOneLine(points, reversalAxis, axisNum().get(j), k);
            }
        }
    }

    private static void rectangleOneLine(List<Point> points, int reversalAxis, int axis, int k) {

        if (points.get(k).getY() == reversalAxis && points.get(k + 1).getY() == reversalAxis) {
            String blankNum = " ";

            if (points.get(k).getX() == axis || points.get(k + 1).getX() == axis) {
                blankNum = POINT;
            }
            System.out.print(blankNum);
        }

    }

    public static void graphHeightLine(int axis, boolean blank) {
        String input = "";
        if (blank == true) {
            input = String.valueOf(axis);
            System.out.print(HORIZONTAL);
            System.out.print(HORIZONTAL);
            System.out.print(input);
        }
    }







}
