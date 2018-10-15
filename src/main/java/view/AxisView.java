package view;

import domain.Point;

import java.util.*;

public class AxisView {
    private static final String HORIZONTAL_BAR = "--";
    private static final String ZERO_BAR = "+";
    private static final String VERTICAL_BAR = "|";
    public static final String BLANK = "  ";

    private AxisView() {

    }

    public static void printHorizontalAxisBar() {
        System.out.print(BLANK);
        System.out.print(ZERO_BAR);
        for (int i = 0; i < Point.MAX_SIZE; i++) {
            System.out.print(HORIZONTAL_BAR);
        }
        System.out.println();
    }

    private static String stringFormat(int num) {
        return String.format("%2d", num);
    }

    public static void printHorizontalAxisNum() {
        System.out.print(" ");
        for (int i = 0; i <= Point.MAX_SIZE; i++) {
            System.out.print(getHorizontalAxisNum(i));
        }
        System.out.println();
    }

    private static String getHorizontalAxisNum(int index) {
        if(index % 2 == 0) {
            return stringFormat(index);
        }
        return BLANK;
    }

    public static void printVerticalAxisNum(int index) {
        System.out.print(getVerticalAxisNum(index));
    }

    public static void printVerticalAxisBar() {
        System.out.print(VERTICAL_BAR);
    }

    private static String getVerticalAxisNum(int index) {
        if(index % 2 == 0) {
            return stringFormat(index);
        }
        return BLANK;
    }

}
