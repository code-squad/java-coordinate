package domain;

import java.util.*;

public class Axis {
    public static final int MAX_SIZE = 24;
    private static final String HORIZONTAL_BAR = "--";
    private static final String ZERO_BAR = "+";
    private static final String BLANK = "  ";
    private static final String VERTICAL_BAR = "|";
    private List<String> horizontalAxisBar = new ArrayList<>();;
    private List<String> horizontalAxisNum = new ArrayList<>();;
    private List<String> verticalAxisBar = new ArrayList<>();;
    private List<String> verticalAxisNum = new ArrayList<>();;

    public Axis() {
        initHorizontalAxisBar();
        initHorizontalAxisNum();
        initVerticalAxisBar();
        initVerticalAxisNum();
    }

    public List<String> getHorizontalAxisBar() {
        return Collections.unmodifiableList(horizontalAxisBar);
    }

    public List<String> getHorizontalAxisNum() {
        return Collections.unmodifiableList(horizontalAxisNum);
    }

    public void initHorizontalAxisNum() {
        for (int i = 0; i <= MAX_SIZE; i++) {
            horizontalAxisNum.add(addHorizontalAxis(i)) ;
        }
    }

    private String addHorizontalAxis(int index) {
        if(index % 2 == 0) {
            return stringFormat(index);
        }
        return BLANK;
    }

    public void initHorizontalAxisBar() {
        horizontalAxisBar.add(BLANK);
        horizontalAxisBar.add(ZERO_BAR);
        for(int i = 0; i < MAX_SIZE; i++) {
            horizontalAxisBar.add(HORIZONTAL_BAR);
        }

    }

    public String stringFormat(int num) {
        return String.format("%2d", num);
    }

    public List<String> getVerticalAxisBar() {
        return Collections.unmodifiableList(verticalAxisBar);
    }

    public List<String> getVerticalAxisNum() {
        return Collections.unmodifiableList(verticalAxisNum);
    }

    public void initVerticalAxisNum() {
        for (int i = 1; i <= MAX_SIZE; i++) {
            verticalAxisNum.add(getVerticalAxis(i));
        }
    }

    public void initVerticalAxisBar() {
        for (int i = 0; i < MAX_SIZE; i++) {
            verticalAxisBar.add(VERTICAL_BAR);
        }
    }

    private String getVerticalAxis(int index) {
        if(index % 2 == 0) {
            return stringFormat(index);
        }
        return BLANK;
    }

}
