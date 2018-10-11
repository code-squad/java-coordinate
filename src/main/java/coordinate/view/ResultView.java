package coordinate.view;

import coordinate.domain.Point;
import coordinate.utill.AxisCondition;

public class ResultView {
    static final String X_BAR = "-";
    static final char Y_BAR = '│';
    static final char ZERO_BAR = '+';
    static final String BLANK = " ";
    static final String DOT = "0";

    public static void createLocationAxis(Point first, Point second) {
        createAxisOfY(first, second);
        createAxisOfX();
    }

    private static void createAxisOfY(Point first, Point second) {
        for (int i = AxisCondition.MAX_AXIS; i > AxisCondition.MIN_AXIS; i--) {
            if (i % 2 == 0) {
                System.out.printf("%2d%s", i, Y_BAR);
                createDot(first, second, i);
                System.out.println();
                continue;
            }
            System.out.printf("%3s", Y_BAR);
            createDot(first, second, i);
            System.out.println();
        }
    }

    private static void createDot(Point first, Point second, int currentToAxisOfY) {
        if (first.equalToAxisOfY(currentToAxisOfY) && second.equalToAxisOfY(currentToAxisOfY)) {
            existToFirstAndSecondOfYInLine(first.sort(second));
        }
        existToFirstAxisOfYInLine(first, second, currentToAxisOfY);
        existToSecondAxisOfYInLine(first, second, currentToAxisOfY);
    }

    private static void existToFirstAndSecondOfYInLine(int[] axisOfX) {
        for (int currentX = 1; currentX < AxisCondition.MAX_AXIS; currentX++) {
            System.out.print(BLANK);
            if (axisOfX[0] == currentX) {
                System.out.print(DOT);
            }
            if (axisOfX[1] == currentX) {
                System.out.print(DOT);
            }
        }
    }

    private static void existToFirstAxisOfYInLine(Point first, Point second, int currentToAxisOfY) {
        if (first.equalToAxisOfY(currentToAxisOfY) && !second.equalToAxisOfY(currentToAxisOfY)) {
            isExistFirst(first);
        }
    }

    private static void isExistFirst(Point first) {
        for (int currentX = 1; currentX < AxisCondition.MAX_AXIS; currentX++) {
            if (first.equalToAxisOfX(currentX)) {
                System.out.printf("%2s", DOT);
                break;
            }
            System.out.printf("%2s", BLANK);
        }
    }

    private static void existToSecondAxisOfYInLine(Point first, Point second, int currentToAxisOfY) {
        if (second.equalToAxisOfY(currentToAxisOfY) && !first.equalToAxisOfY(currentToAxisOfY)) {
            isExistSecond(second);
        }
    }

    private static void isExistSecond(Point second) {
        for (int currentX = 1; currentX < AxisCondition.MAX_AXIS; currentX++) {
            if (second.equalToAxisOfX(currentX)) {
                System.out.printf("%2s", DOT);
                break;
            }
            System.out.printf("%2s", BLANK);

        }
    }

    private static void createAxisOfX() {
        drawXLine();
        drawXNo();
        System.out.println();
        System.out.println();
    }

    private static void drawXLine() {
        System.out.printf("%3s", ZERO_BAR);
        for (int i = 0; i < AxisCondition.MAX_AXIS * 2; i++) {
            System.out.print(X_BAR);
        }
        System.out.println();
    }

    private static void drawXNo() {
        for (int i = 0; i <= AxisCondition.MAX_AXIS; i++) {
            if (i % 2 == 0) {
                System.out.printf("%3d", i);
                continue;
            }
            System.out.print(BLANK);
        }
    }

    public static void distView(double dist){
        System.out.printf("두 점 사이의 거리는 %6f", dist);
    }
}
