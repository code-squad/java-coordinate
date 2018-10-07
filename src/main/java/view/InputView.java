package view;

import util.PointException;

import java.util.*;
import java.util.regex.Pattern;

public class InputView {
    private InputView() {

    }

    private static String getInputPoints() {
        System.out.println("좌표를 입력하세요.");
        return new Scanner(System.in).nextLine();
    }

    private static String isRegex(String input) throws PointException {
        // (10,10)-(10,10)형식인지 확인
        String regex = ".[0-9]{1,2},[0-9]{1,2}.-.[0-9]{1,2},[0-9]{1,2}.";
        if(!Pattern.compile(regex).matcher(input).find()) {
            throw new PointException("잘못된 형식으로 입력하셨습니다. 예) (10,10)-(20,20)");
        }
        return input;
    }

    public static String[] getInput() throws PointException {
        return splitInput(isRegex(getInputPoints()));
    }

    private static String[] splitInput(String input) {
        return input.split("-");
    }

}
