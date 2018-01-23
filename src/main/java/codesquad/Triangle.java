package codesquad;

public class Triangle implements Figurable {
    private final Point p1;
    private final Point p2;
    private final Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double area() {
        double a= new Line(p1, p2).length();
        double b= new Line(p2, p3).length();
        double c= new Line(p3, p1).length();
        double s = (a + b + c)/2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    private static double square(double number) {
        return number * number;
    }
}
