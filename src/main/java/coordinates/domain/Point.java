package coordinates.domain;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean getObjectX(int i){
        if(x == i){
            return true;
        }
        return false;
    }

    public boolean getObjectY(int i){
        if(y == i){
            return true;
        }
        return false;
    }

    public double getMath(Point point){
        return Math.sqrt(Math.pow(Math.abs(point.getX()-x),2)+Math.pow(Math.abs(point.getY()-y),2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
