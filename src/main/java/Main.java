import java.util.List;

public class Main {
    public static void main (String [] args){

        Input.firstInput();
        String pointSet = Input.pointSet();
        List<String> points = Input.pointInput(pointSet);
        Line line = new Line(points);

        line.draw();
        System.out.print(String.format("%3s","+"));
        System.out.println("------------------------------------------------");
        line.printNumber();
        System.out.println();
        ResultView.printResult(line);

    }
}
