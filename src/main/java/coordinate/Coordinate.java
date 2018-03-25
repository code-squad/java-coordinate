package coordinate;

import coordinate.domain.Line;
import coordinate.view.Output;
import coordinate.view.UserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Coordinate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> points = UserInput.getPoints(scanner);
        Line line = new Line(points);

        Output.draw();
        System.out.print(String.format("%3s", "+"));
        System.out.println("------------------------------------------------");
        Output.printNumber();
        System.out.println();
        Output.printResult(line);
    }
}
