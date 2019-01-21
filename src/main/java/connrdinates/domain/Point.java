package connrdinates.domain;

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


    public boolean checkX(int i){
        return x == i;
    }

    public boolean checkY(int i){
        return y == i;
    }


    public double getMath(Point Point){
        return Math.sqrt(Math.pow(Math.abs(Point.getX()-x),2)+Math.pow(Math.abs(Point.getY()-y),2));
    }

    @Override
    public int compareTo(Point Point) {
        if(this.y > Point.y) return -1;
        if(this.y < Point.y) return 1;
        if(this.x > Point.x) return 1;
        if(this.x < Point.x) return -1;
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
