package coordinate.domain;

public class Point {
    private final boolean dot;
    private final int x;


    private Point(boolean dot, int x){
        this.dot = dot;
        this.x = x;
    }

    public static Point ofPoint(int x){
        return new Point(true, x);
    }

    public static Point ofNoPoint(int x){
        return new Point(false, x);
    }

    public boolean isDot(){
        return dot;
    }
}