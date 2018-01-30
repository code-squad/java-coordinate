import java.util.List;

public class Main {
    public static void main (String [] args){

        Input.firstInput();
        String pointSet = Input.pointSet();
        List<String> points = Input.pointInput(pointSet);
        Line line = new Line(points);
        Draw draw = new Draw(points);
        Square square = new Square(points);
        draw.drawline();
        System.out.print(String.format("%3s","+"));
        System.out.println("------------------------------------------------");
        draw.printNumber();
        System.out.println();
        ResultView.printResult(square);

    }
}
