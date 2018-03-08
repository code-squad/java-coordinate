import java.util.List;

public class Main {
    public static void main (String [] args){

        Input.firstInput();
        String pointSet = Input.pointSet();
        List<String> points = Input.pointInput(pointSet);

        int numberOfPoints = points.size();

        if(points.size() == 2) {
            Line line = new Line(points);
            ResultView.printResult(line);
        }

        if(points.size() == 3) {
            Triangle triangle = new Triangle(points);
            ResultView.printResult(triangle);
        }

//        if(points.size() == 4) {
//            Square square = new Square(points);
//            ResultView.printResult(square);
//        }

        Draw draw = new Draw(points);
        draw.drawline(numberOfPoints);
        System.out.print(String.format("%3s","+"));
        System.out.println("------------------------------------------------");
        draw.printNumber();
        System.out.println();
    }
}
