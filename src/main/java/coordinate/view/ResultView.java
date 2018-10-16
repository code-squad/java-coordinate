package coordinate.view;

import coordinate.domain.AbstractFigure;
import coordinate.domain.Point;
import coordinate.utill.AxisCondition;

import java.util.List;

public class ResultView {
    static final String X_BAR = "-";
    static final char Y_BAR = '│';
    static final char ZERO_BAR = '+';
    static final String BLANK = " ";
    static final String DOT = "●";
    static final int Y_OFFSET = 3;
    static final int X_OFFSET = 2;


    public static void createStraight(List<Point> points) {
        createAxisOfY(points);
        createAxisOfX();
    }

    private static void createAxisOfY(List<Point> points) {
        for (int currentY = AxisCondition.MAX_AXIS; currentY > AxisCondition.MIN_AXIS; currentY--) {
            if (currentY % 2 == 0) {
                System.out.printf("%" + Y_OFFSET + "s", String.valueOf(currentY) + Y_BAR);
            }
            if (currentY % 2 == 1) {
                System.out.printf("%" + Y_OFFSET + "s", Y_BAR);
            }
            drawDot(points, currentY);
            System.out.println();
        }
    }

    private static void drawDot(List<Point> points, int currentY) {
        for (int currentX = AxisCondition.MIN_AXIS + 1; currentX <= AxisCondition.MAX_AXIS; currentX++) {
            System.out.printf("%" + X_OFFSET + "s", checkPoint(points, currentX, currentY));
        }
    }

    private static String checkPoint(List<Point> points, int currentX, int currentY) {
        for (Point point : points) {
            if (point.equalToAxisOfX(currentX) && point.equalToAxisOfY(currentY)) {
                return DOT;
            }
        }
        return BLANK;
    }


    private static void createAxisOfX() {
        drawXLine();
        drawXNo();
        System.out.println();
        System.out.println();
    }

    private static void drawXLine() {
        System.out.printf("%" + Y_OFFSET + "s", ZERO_BAR);
        for (int i = 0; i < AxisCondition.MAX_AXIS * 2; i++) {
            System.out.print(X_BAR);
        }
        System.out.println();
    }

    private static void drawXNo() {
        for (int i = 0; i <= AxisCondition.MAX_AXIS; i++) {
            if (i % 2 == 0) {
                System.out.printf("%" + Y_OFFSET + "d", i);
                continue;
            }
            System.out.print(BLANK);
        }
    }

    public static void areaView(AbstractFigure f) {
        System.out.print(f.outputMessage());
    }
}
