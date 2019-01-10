package coordinates.domain;

import java.util.List;

public class Rectangle {

    private List<Line> point;

    public Rectangle(List<Line> point){
        this.point = point;
    }

    public double a (int i){
        return point.get(i).mathPoint();
    }


}
