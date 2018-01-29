import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String [] args){
        DrawVertical.drawVertival();
        DrawHorizon.drawHorizon();
        System.out.println();
        DrawHorizon.printNumber();
        System.out.println();
        Input.firstInput();
        String pointSet = Input.pointSet();
        List<String> points = Input.pointInput(pointSet);
        Input.pointDivide(points);
        //Input.print();
        Input.distance();
    }
}
