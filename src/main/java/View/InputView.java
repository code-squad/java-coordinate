package View;

import java.util.Scanner;

public class InputView {

    public static String initCoordinate() throws RuntimeException{
        Scanner scanner = new Scanner(System.in);
            String coordinates = scanner.nextLine();
            return coordinates;
    }

}
