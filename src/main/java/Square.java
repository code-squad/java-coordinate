
import java.util.List;

public class Square extends Figure {
    public Square(List<String> points) {
        super(points);
    }

    public int distance(int start, int end) {
        return (int)super.distance(getPoint(start), getPoint(end));
    }

    int width = distance(0, 1);
    int height = distance(1, 2);

    public double area() {
        return width * height;
    }
}
