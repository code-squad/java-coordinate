package domain;

import java.util.ArrayList;
import java.util.List;

public class MakingPoints {
    static final int X_POSITION = 0;
    static final int Y_POSITION = 1;

    public static List<Point> makePoints(List<Integer[]> posIntegerList) {
        List<Point> pointList = new ArrayList<>();
        for (int i = 0; i < posIntegerList.size(); i++) {
            pointList.add(new Point(posIntegerList.get(i)[X_POSITION], posIntegerList.get(i)[Y_POSITION]));
        }
        return pointList;
    }
}