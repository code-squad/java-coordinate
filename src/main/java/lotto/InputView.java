package lotto;

import java.util.*;

public class InputView {
    static Scanner scan = new Scanner(System.in);

    public static Set<Integer> gameNum() {
        Set<Integer> inputNum = new HashSet<>();
        String userInput = scan.next();
        String[] split = userInput.split(",");
        for (String s : split) {
        }
        return inputNum;
    }
}
