package coordinate.domain;

import java.util.ArrayList;

public class Movement {

    private static final int MAX_NUM = 24;

    public ArrayList<Integer> axis() {
        ArrayList<Integer> axisNum = new ArrayList<>();
        for (int i = 0; i <= MAX_NUM; i++) {
            axisNum.add(i);
        }
        return axisNum;
    }
}
