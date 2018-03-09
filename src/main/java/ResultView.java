import java.util.List;

public class ResultView extends Figure {
    public ResultView(List<String> points) {
        super(points);
    }
    public void printResult(int i, List<String> points) {
        if (i == 2) {
            Line figure = new Line(points);
            System.out.println("선의 길이 : " + figure.distance(super.getPoint(0), super.getPoint(1)));
        }

        if (i == 3) {
            Triangle figure = new Triangle(points);
            System.out.println("삼각형의 넓이 : " + figure.area());
        }

        if (i == 4) {
            Square figure = new Square(points);
            System.out.println("사각형 넓이 : " + figure.area());
        }
    }
}
