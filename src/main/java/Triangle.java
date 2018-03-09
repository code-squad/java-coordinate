import java.util.List;

public class Triangle extends Figure implements Area {
    public Triangle (List<String> points) {
        super(points);
    }

    double a = super.getPoint(0).disance(super.getPoint(1));
    double b = super.getPoint(1).disance(super.getPoint(2));
    double c = super.getPoint(2).disance(super.getPoint(0));

    @Override
    public double area() {
        double s = (a + b + c / 2);
        double result = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5 );
        return Math.round((result * 100d) / 100d);
    }
}
