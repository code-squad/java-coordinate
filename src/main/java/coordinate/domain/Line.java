package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {
    private List<Point> points = new ArrayList<>();

    Line(){
        for (int x = 0; x < 24; x++){
            this.points.add(Point.ofNoPoint());
        }
    }

    public boolean askPoint(int index){
        return points.get(index).isDot();
    }
}