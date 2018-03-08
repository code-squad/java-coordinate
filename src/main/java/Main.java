import java.util.List;

public class Main {
    public static void main (String [] args){

        Input.firstInput();
        String pointSet = Input.pointSet();
        List<String> points = Input.pointInput(pointSet);

        int numberOfPoints = points.size();

        if(points.size() == 2) {
            Figure figure = new Line(points);
        }

        if(points.size() == 3) {
            Figure figure = new Triangle(points);
        }

        if(points.size() == 4) {
            Square figure = new Square(points);
            ResultView.printResult(figure);
        }

        ResultView.printResult(figure);

        Draw draw = new Draw(points);
        draw.drawline(numberOfPoints);
        System.out.print(String.format("%3s","+"));
        System.out.println("------------------------------------------------");
        draw.printNumber();
        System.out.println();
    }
}
