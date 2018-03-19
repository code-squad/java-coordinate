package coordinate.domain;

public class Point {
    private final boolean dot;

    private Point(boolean dot){
        this.dot = dot;
    }

    public static Point ofPoint(){
        return new Point(true);
    }

    public static Point ofNoPoint(){
        return new Point(false);
    }

    public boolean isDot(){
        return dot;
    }
}