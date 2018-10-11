package coordinate;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) throws IllegalArgumentException {
        if (x < 0 || x > 24 || y < 0 || y > 24)
            throw new IllegalArgumentException();
        this.x = x;
        this.y = y;
    }

    public double calculatorLength(Point points) {
        return Math.sqrt(Math.pow(this.x - points.x, 2) + Math.pow(this.y - points.y, 2));
    }

    public Boolean matchPoint(int x, int y) {
        return this.x*3 == x && this.y == y;
    }
}
