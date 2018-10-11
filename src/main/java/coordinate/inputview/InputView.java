package coordinate.inputview;

import coordinate.domain.Point;
import coordinate.domain.PointFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class InputView {
    public static ArrayList<Point> input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("좌표를 입력해주세요");

        String result = scanner.nextLine();
        ArrayList<Point> points = PointFactory.makePointFactory(result);

        return points;
    }

}
