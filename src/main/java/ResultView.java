public class ResultView {
    public static void printResult(Square square){
        System.out.println("가로의 길이 " + square.width());
        System.out.println("세로의 길이 " + square.height());
        System.out.println("사각형의 넓이 : " + square.area(square.width(), square.height()));
    }
}
