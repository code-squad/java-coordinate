package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Row {
    private final int y;
    private final List<Point> points = new ArrayList<>();

    Row(int rowNumber){
        this.y = rowNumber;

        for (int x = 0; x <= 24; x++){
            points.add(Point.ofNoPoint(x));
        }
    }

    public boolean dotAtPoint(int x){
        return points.get(x).isDot();
    }
}
