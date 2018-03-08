import java.util.List;

public class Triangle extends Figure {
    public Triangle (List<String> points) {
        super(points);
    }

    double a = super.distance(getPoint(0), getPoint(1));
    double b = super.distance(getPoint(1), getPoint(2));
    double c = super.distance(getPoint(2), getPoint(0));

    public double area() {
        double s = (a + b + c / 2);
        double result = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5 );
        return Math.round((result * 100d) / 100d);
    }
}
