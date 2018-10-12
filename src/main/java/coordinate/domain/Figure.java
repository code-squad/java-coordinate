package coordinate.domain;

import java.util.List;

public abstract class Figure implements Area{
    private List<Point> points;

    public Figure(List<Point> points) {
        this.points = points;
    }

    protected Point getPoint(int index){
        return this.points.get(index);
    }

    protected int getPointsSize(){
        return this.points.size();
    }

    protected abstract boolean isValid();

    public abstract String getName();
}
