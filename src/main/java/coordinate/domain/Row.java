package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private static final int DOMAIN = 24;
    private final List<Coordinate> row = new ArrayList<>();

    Row(List<Integer> xCoordOfPoints) {
        for (int x = 0; x <= DOMAIN; x++) {
            row.add(addCoordinate(xCoordOfPoints, x));
        }
    }

    public Coordinate addCoordinate(List<Integer> xCoordOfPoints, int x){
        if(xCoordOfPoints.contains(x)){
            return Coordinate.ofPoint();
        }
        return Coordinate.ofNoPoint();
    }

    public boolean dotAtPoint(int x) {
        return row.get(x).isDot();
    }

    public int getRowSize() {
        return row.size();
    }
}