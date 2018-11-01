package coordinate.controller;

public class Point {
    private int x = 0;
    private int y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getDistance(Point point){
        //제곱근((A.x - B.x)^제곱 + (A.y - B.y)^제곱)
       return Math.sqrt(Math.pow(Math.abs(x - point.getX()),2)+Math.pow(Math.abs(y-point.getY()),2));
    }
}
