package coordinates.domain;

public class Point implements Comparable<Point> {

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

    public double getMath(Point point){
        return Math.sqrt(Math.pow(Math.abs(point.getX()-x),2)+Math.pow(Math.abs(point.getY()-y),2));
    }

    @Override
    public int compareTo(Point point) {
        if(this.y > point.y) return -1;
        if(this.y < point.y) return 1;
        if(this.x > point.x) return 1;
        if(this.x < point.x) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}' + System.lineSeparator();
    }
}
