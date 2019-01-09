package coordinates.view;

import coordinates.domain.Point;

import java.util.List;

public class ResultView {

    private static final String STICK = "｜";
    private static final String HORIZONTAL = "￣";
    private static final String POINT = "ㆍ";

    public void graphHeightLine(int axis, boolean blank) {
        String input = "";
        if (blank == true) {
            input = String.valueOf(axis);
            System.out.print(HORIZONTAL);
            System.out.print(HORIZONTAL);
            System.out.print(input);
        }
    }

    public void graphWidthLin(List<Point> points, List<Integer> reversalAxis, List<Integer> axis) {
        for (int i = 0; i < 24; i++) {
            System.out.print(String.format("%2d", reversalAxis.get(i)));
            System.out.print(STICK);

            twoLine(points, reversalAxis.get(i), axis);

            System.out.println();
        }
    }

    private void twoLine(List<Point> points, int reversalAxis, List<Integer> axis) {
        for (int k = 0; k < 2; k++) {
            if (points.get(k).getY() == reversalAxis) {
                oneLine(points.get(k), axis);
            }
        }
    }

    private void oneLine(Point points, List<Integer> axis) {
        for (int j = 0; j < 24; j++) {
            String blankNum = " ";
            if (points.getX() == axis.get(j)) {
                blankNum = POINT;
            }
            System.out.print(blankNum);
        }
    }

    public void mathLine(double line) {
        System.out.println("두 점의 길이는 : " + line);
    }
}
