package coordinates.view;

import coordinates.domain.Point;
import org.slf4j.Logger;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class ResultView {

    private static final String STICK = "｜";
    private static final String HORIZONTAL = " ";
    private static final String POINT = "ㆍ";
    private static final Logger log = getLogger(ResultView.class);

    public static void graphWidthLin(List<Point> points, List<Integer> reversalAxis, List<Integer> axis) {
        for (int i = 0; i < 24; i++) {
            System.out.print(String.format("%2d", reversalAxis.get(i)));
            System.out.print(STICK);

            figureForm(points, reversalAxis.get(i), axis);
            System.out.println();
        }
    }

    private static void figureForm(List<Point> points, int reversalAxis, List<Integer> axis) {
        if (points.size() > 2) {
            rectangleTwoLine(points, reversalAxis, axis);
        } else {
            twoLine(points, reversalAxis, axis);
        }
    }

    private static void rectangleTwoLine(List<Point> points, int reversalAxis, List<Integer> axis) {
        for (int k = 0; k < points.size(); k = k + 2) {
            for (int j = 0; j < 24; j++) {
                rectangleOneLine(points, reversalAxis, axis.get(j), k);
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

    private static void twoLine(List<Point> points, int reversalAxis, List<Integer> axis) {
        for (int k = 0; k < 2; k++) {
            if (points.get(k).getY() == reversalAxis) {
                oneLine(points.get(k), axis);
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

    public static void graphHeightLine(int axis, boolean blank) {
        String input = "";
        if (blank == true) {
            input = String.valueOf(axis);
            System.out.print(HORIZONTAL);
            System.out.print(HORIZONTAL);
            System.out.print(input);
        }
    }

    public static void height(List<Integer> axiss) {
        for (int i = 0; i < axiss.size(); i++) {
            int axis = axiss.get(i);
            graphHeightLine(axis, blankCondition(axiss.get(i)));
        }
        System.out.println();
    }

    public static boolean blankCondition(int axis) {
        //1~24까지의 %2는 true
        return axis % 2 == 0;
    }

    public static void mathLine(double line) {
        System.out.println("두 점의 길이는 : " + line);
    }
}
