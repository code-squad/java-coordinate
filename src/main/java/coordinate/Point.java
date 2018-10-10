package coordinate;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y)throws IllegalArgumentException {
        if (x < 0 || x > 24 || y < 0 || y > 24)
            throw new IllegalArgumentException();
        this.x = x;
        this.y = y;
    }

    public double calculatorLength(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public Boolean isX(int x) {
        return this.x * 3 == x;
    }

    public Boolean isY(int y) {
        return this.y == y;
    }
}
