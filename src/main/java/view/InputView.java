package view;

import java.util.*;

public class InputView {
    static Scanner scanner = new Scanner(System.in);

    public static String inputCoordinate() {
        System.out.println("좌표를 입력하세요");
        String seperateDash = scanner.next();
        return seperateDash;
    }

}