import java.util.List;

public class Main {
    public static void main (String [] args){
        Input.firstInput();
        String pointSet = Input.pointSet();
        List<String> points = Input.pointInput(pointSet);
        int numberOfPoints = points.size();

        Draw draw = new Draw(points);
        draw.drawline(numberOfPoints);
        System.out.print(String.format("%3s","+"));
        System.out.println("------------------------------------------------");
        draw.printNumber();
        System.out.println();
        ResultView.printResult(numberOfPoints, points);
    }
}
