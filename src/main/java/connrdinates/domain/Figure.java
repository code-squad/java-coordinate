package connrdinates.domain;

import java.util.List;

public abstract class Figure implements Area{
    List<Point> points;

    public Figure(List<Point> points){
        this.points = points;
    }

    abstract public boolean valid();

    abstract public String name();
}
