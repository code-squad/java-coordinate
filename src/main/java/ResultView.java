public class ResultView {
    public static void printResult(Line line){
        System.out.println("가로의 길이 " + line.width());
        System.out.println("세로의 길이 " + line.height());
        System.out.println("사각형의 넓이 : " + line.area(line.width(), line.height()));
    }
}
