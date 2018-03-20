package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private static final int DOMAIN = 24;
    private final List<Point> row = new ArrayList<>();

    Row(int dotIndex) {
        for (int x = 0; x <= DOMAIN; x++) {
            row.add(addPoint(dotIndex, x));
        }
    }

    Point addPoint(int dotIndex, int x){
        if(x == dotIndex) {
            return Point.ofPoint();
        }
        return Point.ofNoPoint();
    }

    public boolean dotAtPoint(int x) {
        return row.get(x).isDot();
    }

    public int getRowSize() {
        return row.size();
    }

    public List<Point> getRow(){
        return row;
    }
}