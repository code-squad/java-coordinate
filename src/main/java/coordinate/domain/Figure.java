package coordinate.domain;

import java.util.List;

public abstract class Figure implements Area{
    protected List<Point> coordinate;

    protected Figure(List<Point> coordinate){
        this.coordinate = coordinate;
    }
}
