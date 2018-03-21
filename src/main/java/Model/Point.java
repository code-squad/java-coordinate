package Model;

public class Point {

    private int x;
    private int y;

    private Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    @Override
    public String toString(){
        return "．  ";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point point = (Point) obj;
            if (this.x == point.x && this.y == point.y) return true;
        }
        return false;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
}
