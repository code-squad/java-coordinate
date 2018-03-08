import java.util.List;

public class Triangle extends Figure {
    public Triangle (List<String> points) {
        super(points);
    }

    public double distance(int start, int end) {
        return super.distance(getPoint(start), getPoint(end));
    }

    double a = distance(0, 1);
    double b = distance(1, 2);
    double c = distance(2, 0);

    public double area() {
        double s = (a + b + c / 2);
        double result = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5 );
        return Math.round((result * 100d) / 100d);
    }
}
