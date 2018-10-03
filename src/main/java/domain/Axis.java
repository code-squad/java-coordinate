package domain;

import java.util.*;

public class Axis {
    public static final int MAX_SIZE = 24;
    private static final String HORIZONTAL_BAR = "--";
    private static final String ZERO_BAR = "+";
    private static final String BLANK = "  ";
    private static final String VERTICAL_BAR = "|";

    private Axis() {

    }

    public static List<String> getHorizontalAxisBar() {
        return Collections.unmodifiableList(initHorizontalAxisBar());
    }

    public static List<String> getHorizontalAxisNum() {
        return Collections.unmodifiableList(initHorizontalAxisNum());
    }

    private static List<String> initHorizontalAxisBar() {
        List<String> horizontalAxisBar = new ArrayList<>();
        horizontalAxisBar.add(BLANK);
        horizontalAxisBar.add(ZERO_BAR);
        for(int i = 0; i < MAX_SIZE; i++) {
            horizontalAxisBar.add(HORIZONTAL_BAR);
        }
        return horizontalAxisBar;
    }

    private static String stringFormat(int num) {
        return String.format("%2d", num);
    }

    private static List<String> initHorizontalAxisNum() {
        List<String> horizontalAxisNum = new ArrayList<>();
        horizontalAxisNum.add(" ");
        for (int i = 0; i <= MAX_SIZE; i++) {
            horizontalAxisNum.add(addHorizontalAxis(i)) ;
        }
        return horizontalAxisNum;
    }

    private static String addHorizontalAxis(int index) {
        if(index % 2 == 0) {
            return stringFormat(index);
        }
        return BLANK;
    }

    public static List<String> getVerticalAxisBar() {
        return Collections.unmodifiableList(initVerticalAxisBar());
    }

    public static List<String> getVerticalAxisNum() {
        return Collections.unmodifiableList(initVerticalAxisNum());
    }

    private static List<String> initVerticalAxisNum() {
        List<String> verticalAxisNum = new ArrayList<>();
        for (int i = 1; i <= MAX_SIZE; i++) {
            verticalAxisNum.add(getVerticalAxis(i));
        }
        return verticalAxisNum;
    }

    private static List<String> initVerticalAxisBar() {
        List<String> verticalAxisBar = new ArrayList<>();
        for (int i = 0; i < MAX_SIZE; i++) {
            verticalAxisBar.add(VERTICAL_BAR);
        }
        return verticalAxisBar;
    }

    private static String getVerticalAxis(int index) {
        if(index % 2 == 0) {
            return stringFormat(index);
        }
        return BLANK;
    }

}
