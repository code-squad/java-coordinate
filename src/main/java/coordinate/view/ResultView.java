package coordinate.view;

import coordinate.domain.Point;

import java.util.Arrays;

public class ResultView {
    static final int AXIS_MAX = 24;
    static final String X_BAR = "━━";
    static final char Y_BAR = '│';
    static final char ZERO_BAR = '+';
    static final String BLANK = "  ";
    static final String DOT = "●";

    public static void createLocationAxis(Point first, Point second){
        createYAxis(first, second);
        createXAxis();
    }

    private static void createYAxis(Point first, Point second) {
        for (int i = AXIS_MAX; i > 0; i--) {
            if(i % 2 == 0){
                System.out.printf("%2d", i);
                System.out.print(Y_BAR);
                createDot(first, second, i);
                System.out.println();
                continue;
            }
            System.out.print(BLANK + Y_BAR);
            createDot(first, second, i);
            System.out.println();
        }
    }

    private static void createDot(Point first, Point second, int i) {
        if(i == first.getY() && i == second.getY()){
            int[] sameX = new int[]{first.getX(),second.getX()};
            Arrays.sort(sameX);
            oneLineXY(sameX);
        }

        oneLineF(first, second, i);
        oneLineS(first, second, i);
    }

    private static void oneLineS(Point first, Point second, int i) {
        if (i == second.getY() && i != first.getY()) {
            isExistSecond(second);
        }
    }

    private static void isExistSecond(Point second) {
        for (int j = 1; j < AXIS_MAX; j++) {
            System.out.print(BLANK);
            if (second.getX() == j) {
                System.out.print(DOT);
                break;
            }
        }
    }

    private static void oneLineF(Point first, Point second, int i) {
        if (i == first.getY() && i != second.getY()) {
            isExistFirst(first);
        }
    }

    private static void isExistFirst(Point first) {
        for (int j = 1; j < AXIS_MAX; j++) {
            System.out.print(BLANK);
            if (first.getX() == j) {
                System.out.print(DOT);
                break;
            }
        }
    }

    private static void oneLineXY(int[] sameX) {
        for (int j = 1; j < AXIS_MAX; j++) {
            System.out.print(BLANK);
            if(sameX[0] == j){
                System.out.print(DOT);
            }
            if(sameX[1] == j){
                System.out.print(DOT);
            }
        }
    }

    private static void drawXLine() {
        System.out.print(BLANK + ZERO_BAR);
        for (int i = 0; i < AXIS_MAX; i++) {
            System.out.print(X_BAR);
        }
        System.out.println();
    }

    private static void createXAxis() {
        drawXLine();
        System.out.print(" ");
        for (int i = 0; i <= AXIS_MAX; i++) {
            if(i % 2 == 0){
                System.out.printf("%2d", i);
                continue;
            }
            System.out.print(BLANK);
        }
        System.out.println();
        System.out.println();
    }

    public static void distView(double dist){
        System.out.printf("두 점 사이의 거리는 %6f", dist);
    }
}
