public class ResultView {
    public static void printResult(Triangle triangle) {
        System.out.println("삼각형의 넓이 : " + triangle.area());
    }

    public static void printResult(Square square) {
        System.out.println("사각형 넓이 : " + square.area());
    }

    public static void printResult(Line line) {
        System.out.println("선의 길이 : " + line.distance);
    }
}
