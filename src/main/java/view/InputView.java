package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static List<String> getCoordinates() {
        System.out.println("좌표를 입력하세요.");
        String userInput = scanner.next();
        userInput = userInput.replaceAll("[()]", ""); // 11,12-13,14
        // todo 다른형식이 들어왔을 때 체크하는 것
        return Arrays.asList(userInput.split("[-,]")); // [11, 12, 13, 14]
    }
}