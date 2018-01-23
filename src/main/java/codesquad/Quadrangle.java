package codesquad;

public class Quadrangle implements Figurable {
    private final Point p1;
    private final Point p2;
    private final Point p3;
    private final Point p4;

    public Quadrangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double area() {
        int xLength = p2.lengthX(p1);
        int yLength = p3.lengthY(p2);
        return xLength * yLength;
    }
}
