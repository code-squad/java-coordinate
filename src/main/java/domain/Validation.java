//package domain;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Validation {
//    public static Boolean isValid(ArrayList<Point> points) {
//        if(points.size() == 4) {
//            return isRectangle(points);
//        }
//    }
//
//    public static Boolean isValidNumber(List<String> numbers) {
//        for (String number : numbers) {  // todo 2depth
//            int convertedNumber = Integer.parseInt(number);
//            if (!(convertedNumber >= 0 && convertedNumber < 25)) {
//                System.out.println("입력한 숫자의 범위를 다시 확인해주세요.");
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static Boolean isRectangle(ArrayList<Point> points) {
//        Point first = points.get(0);
//        Point second = points.get(1);
//        int firstX = first.getX();
//        int firstY = first.getY();
//        for (Point point : points) {
//
//        }
//    }
//}
