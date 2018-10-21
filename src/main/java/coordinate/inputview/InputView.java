package coordinate.inputview;

import coordinate.domain.Point;
import coordinate.domain.PointFactory;

import java.util.List;
import java.util.Scanner;

public class InputView {
    public static List<Point> input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("좌표를 입력해주세요");

        String result = scanner.nextLine();

        return PointFactory.makePointFactory(result);
    }

}
