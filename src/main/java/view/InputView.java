package view;

import domain.Point;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static ArrayList<Point> getCoordinates() {
        List<String> numbers = new ArrayList<>();
        Boolean validation = false;
        while (!validation) {
            numbers = Arrays.asList(getUserInput());
            validation = isValid(numbers);
        }
        return Point.makePoints(numbers);
    }

    private static Boolean isValid(List<String> numbers) {
        for (String number : numbers) {  // todo 2depth
            int convertedNumber = Integer.parseInt(number);
            if (!(convertedNumber >= 0 && convertedNumber < 25)) {
                System.out.println("입력한 숫자의 범위를 다시 확인해주세요.");
                return false;
            }
        }
        return true;
    }

    private static String[] getUserInput() {
        String userInput = scanner.next();
        userInput = userInput.replaceAll("[()]", ""); // 11,12-13,14
        return userInput.split("[-,]"); // [11, 12, 13, 14]
    }
}