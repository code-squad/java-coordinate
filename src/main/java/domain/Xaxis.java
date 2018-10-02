package domain;

import java.util.*;

public class Xaxis implements Axis {
    public static final String HORIZONTAL_BAR = "--";
    public static final String ZERO_BAR = "+";
    private List<String> horizontalAxisBar;
    private List<String> horizontalAxisNum;

    public Xaxis() {
        horizontalAxisBar = new ArrayList<>();
        horizontalAxisNum = new ArrayList<>();
        initAxisBar();
        initAxisNum();
    }

    public List<String> getHorizontalAxisBar() {
        return Collections.unmodifiableList(horizontalAxisBar);
    }

    public void setHorizontalAxisBar(List<String> horizontalAxisBar) {
        this.horizontalAxisBar = horizontalAxisBar;
    }

    public List<String> getHorizontalAxisNum() {
        return Collections.unmodifiableList(horizontalAxisNum);
    }

    public void setHorizontalAxisNum(List<String> horizontalAxisNum) {
        this.horizontalAxisNum = horizontalAxisNum;
    }

    @Override
    public void initAxisNum() {
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

    @Override
    public void initAxisBar() {
        horizontalAxisBar.add(Axis.BLANK);
        horizontalAxisBar.add(Xaxis.ZERO_BAR);
        for(int i = 0; i < Axis.MAX_SIZE; i++) {
            horizontalAxisBar.add(Xaxis.HORIZONTAL_BAR);
        }

    }
}
