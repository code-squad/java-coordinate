package domain;

import java.util.List;

public abstract class Figure {
    private List<Point> points;

    Figure(List<Point> points){
        this.points = points;
    }

    protected Point getPoint(int index){
        return points.get(index);
    }

    protected int getPointsSize(){
        return points.size();
    }

    protected abstract double area();
    protected abstract void checkSize();
}
