public class ResultView {
    public static void printResult(Line line){
        System.out.println("x의 길이 " + line.xDistance());
        System.out.println("y의 길이 " + line.yDistance());
        System.out.println("두 점 사이의 거리는 : " + line.calculateDistance());
    }
}
