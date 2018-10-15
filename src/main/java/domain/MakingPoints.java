package domain;

import java.util.ArrayList;
import java.util.List;

public class MakingPoints {
    public static List<Point> makePointList(List<Integer[]> posIntegerList) {
        List<Point> pointList = new ArrayList<>();
        for (int i = 0; i < posIntegerList.size(); i++) {
            pointList.add(new Point(posIntegerList.get(i)[0], posIntegerList.get(i)[1]));
        }
        return pointList;
    }
}
