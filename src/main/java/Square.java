
import java.util.List;

public class Square extends Figure implements Area {
    public Square(List<String> points) {
        super(points);
    }

    int width = (int)super.distance(getPoint(0), getPoint(1));
    int height = (int)super.distance(getPoint(1), getPoint(2));

    @Override
    public double area() {
        return width * height;
    }
}
