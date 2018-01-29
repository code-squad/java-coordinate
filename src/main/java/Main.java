import java.util.List;

public class Main {
    public static void main (String [] args){

        Input.firstInput();
        String pointSet = Input.pointSet();
        List<String> points = Input.pointInput(pointSet);
        Input.pointDivide(points);

        DrawLine.draw();
        System.out.print(String.format("%3s","+"));
        System.out.println("------------------------------------------------");
        DrawLine.printNumber();
        System.out.println();
        ResultView.distance();

    }
}
