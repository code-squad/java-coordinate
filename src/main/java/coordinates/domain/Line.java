package coordinates.domain;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class Line {
    private static final Logger log = getLogger(Line.class);

    private Point point; //x와 y값
    private Point distinctPoint; // x와 y값

    public Line(Point point, Point distinctPoint){
        this.point = point;
        this.distinctPoint = distinctPoint;
    }

    public boolean getLineFormY(){
        return getY() == getDistinctY();
    }

    public boolean getLineFormX(Line line){
        return getX() == line.getX() || getDistinctX() == line.getDistinctX();
    }

    public int getX(){
        return point.getX();
    }

    public int getY(){
        return point.getY();
    }

    public int getDistinctX(){
        return distinctPoint.getX();
    }

    public int getDistinctY(){
        return distinctPoint.getY();
    }

    public double mathPoint(){
        return point.getMath(distinctPoint);
    }

    public double area(Line line){
        return line.mathPoint() * mathPoint();
    }

    @Override
    public String toString() {
        return "Line{" +
                "point=" + point +
                ", distinctPoint=" + distinctPoint +
                '}';
    }
}
