package coordinate.view;

import java.util.Scanner;

public class InputView {
    static Scanner sc = new Scanner(System.in);

    public static String[] inputCoordinate(){
        System.out.println("좌표를 입력하세요.");
        return deshSeparator(sc.nextLine());
    }

    public static String[] deshSeparator(String text){
        String [] values = text.split("-");
        return parenthesisRemove(values);
    }

    public static String[] parenthesisRemove(String[] text){
        String [] values = new String[2];
        for (int i = 0; i < text.length; i++) {
            values[i] = text[i].replace("(","").replace(")","");
        }
        return values;
    }
}
