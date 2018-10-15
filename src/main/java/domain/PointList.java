package domain;

import java.util.ArrayList;
import java.util.List;

public class PointList {
    private List<Integer[]> posIntegerList;

    public PointList(List<Integer[]> posIntegerList) {
        this.posIntegerList = posIntegerList;
    }

    public List<Point> makePointList() {
        List<Point> pointList = new ArrayList<>();
        for (int i = 0; i < posIntegerList.size(); i++) {
            pointList.add(new Point(posIntegerList.get(i)[0], posIntegerList.get(i)[1]));
        }
        return pointList;
    }
}
