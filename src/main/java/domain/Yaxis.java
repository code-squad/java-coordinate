package domain;

import java.util.*;

public class Yaxis implements Axis {
    public static final String VERTICAL_BAR = "|";
    private List<String> verticalAxisBar;
    private List<String> verticalAxisNum;

    public Yaxis() {
        verticalAxisBar = new ArrayList<>();
        verticalAxisNum = new ArrayList<>();
        initAxisBar();
        initAxisNum();
    }

    public List<String> getVerticalAxisBar() {
        return Collections.unmodifiableList(verticalAxisBar);
    }

    public void setVerticalAxisBar(List<String> verticalAxisBar) {
        this.verticalAxisBar = verticalAxisBar;
    }

    public List<String> getVerticalAxisNum() {
        return Collections.unmodifiableList(verticalAxisNum);
    }

    public void setVerticalAxisNum(List<String> verticalAxisNum) {
        this.verticalAxisNum = verticalAxisNum;
    }

    @Override
    public void initAxisNum() {
        for (int i = 1; i <= MAX_SIZE; i++) {
            verticalAxisNum.add(getVerticalAxis(i));
        }
    }

    @Override
    public void initAxisBar() {
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
