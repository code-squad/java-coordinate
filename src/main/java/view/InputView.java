package view;

import dto.PointDto;
import util.Parser;
import util.SizeChecker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("좌표를 입력하세요.");
        return sc.nextLine();
    }

    public static PointDto makePointDto(String value) {
        int[] values = Parser.splitStrPoint(value);

        return new PointDto(values[0], values[1]);
    }

    public static List<PointDto> makePointDtos(String[] values) {
        List<PointDto> result = new ArrayList<>();

        for (String value : values) {
            result.add(makePointDto(value));
        }
        return result;
    }

    // 입력을 받아서 Dto를 만들다가 잘못된 값을 찾으면 처음으로 다시 돌아간다.
    public static List<PointDto> inputCoordinate() {
        while (true) {
            String[] values = Parser.parsingPointString(input());

            if (SizeChecker.pointsSizeChecker(values)) {
                return makePointDtos(values);
            }
        }
    }

}
