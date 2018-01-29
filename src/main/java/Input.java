import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Input {
    public static void firstInput() {
        System.out.println("좌표를 입력하세요.");
    }

     public static String pointSet(){
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        return inputValue;
    }

    public static List<String> pointInput(String pointSet){
        return Arrays.asList(pointSet.split("-"));
    }

//    public List<String> pointDivide(List<String> points){
//        for(int i = 0; i < points.size(); i++){
//            String info = points.get(i).substring(1 , points.get(i).length()-1);
//
//        }
//    }


}
