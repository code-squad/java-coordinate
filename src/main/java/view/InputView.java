package view;

import domain.Point;
import util.Parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static String input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("좌표를 입력하세요.");
        return sc.nextLine();
    }

    public static Point makePoint(String value) throws IllegalArgumentException {
        int[] values = Parser.splitStrPoint(value);

        return Point.init(values[0], values[1]);
    }

    public static List<Point> makePoints(String[] values) {
        List<Point> result = new ArrayList<>();

        for (String value : values) {
            result.add(makePoint(value));
        }
        return result;
    }

    // 입력을 받아서 Dto를 만들다가 잘못된 값을 찾으면 처음으로 다시 돌아간다.
    public static List<Point> inputPoints() {
        while (true) {
            try {
                List<Point> result = makePoints(Parser.parsingPointString(input()));
                return result;
            } catch (IllegalArgumentException e) {
                System.out.println("입력 범위를 초과하였습니다.");
            }
        }
    }

}
