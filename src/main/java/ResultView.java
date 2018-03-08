import java.util.List;

public class ResultView {
//    public static void printResult(Triangle triangle) {
//        System.out.println("삼각형의 넓이 : " + triangle.area());
//    }
//
//    public static void printResult(Square square) {
//        System.out.println("사각형 넓이 : " + square.area());
//    }
//
//    public static void printResult(Line line) {
//        System.out.println("선의 길이 : " + line.distance());
//    }
//
//    public static void printResult(Triangle figure) {
//        System.out.println("삼각형의 넓이 : " + figure.area());
//    }
//
//    public static void printResult(Square figure) {
//        System.out.println("사각형 넓이 : " + figure.area());
//    }
//
//    public static void printResult(Line figure) {
//        System.out.println("선의 길이 : " + figure.distance());
//    }

    public static void printResult(Figure figure) {
        if (figure instanceof Square)
            System.out.println("사각형의 넓이 : " + figure.area());

        if (figure instanceof Triangle)
            System.out.println("삼각형의 넓이 : " + figure.area());

        if (figure instanceof Line)
            System.out.println("선의 길이 : " + ((Line) figure).distance());
    }
}
