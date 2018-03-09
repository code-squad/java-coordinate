
import java.util.List;

public class Square extends Figure implements Area {
    public Square(List<String> points) {
        super(points);
        Line line = new Line(points);

    }
    public int width() {
        return (int)line.distance(super.getPoint(0), super.getPoint(1));
    }

    public int height() {
        return (int)line.distance(super.getPoint(1), super.getPoint(2));
    }

    @Override
    public double area() {
        return width() * height();
    }
}
