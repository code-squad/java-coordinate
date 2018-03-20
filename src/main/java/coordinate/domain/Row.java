package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private static final int DOMAIN = 24;
    private final int y;
    private final List<Point> points = new ArrayList<>();

    Row(int rowNumber){
        this.y = rowNumber;

        for (int x = 0; x <= DOMAIN; x++){
            points.add(Point.ofNoPoint(x));
        }
    }

    public boolean dotAtPoint(int x){
        return points.get(x).isDot();
    }

    public int getRowSize(){
        return points.size();
    }
}
