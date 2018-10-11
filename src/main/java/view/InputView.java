package view;

import domain.Figure;
import domain.FigureMaker;
import domain.Point;
import util.Parser;

import java.util.*;

public class InputView {

    public static String input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("좌표를 입력하세요.");
        return sc.nextLine();
    }

    public static Point makePoint(String value) {
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
    public static Figure makeFigure() {
        while (true) {
            try {
                return FigureMaker.init(makePoints(Parser.parsingPointString(input())));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
