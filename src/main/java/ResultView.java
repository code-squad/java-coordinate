public class ResultView {
    public static void printResult(){
        System.out.println("x의 길이 " + Line.xDistance());
        System.out.println("y의 길이 " + Line.yDistance());
        System.out.println("두 점 사이의 거리는 : " + Line.calculateDistance());
    }
}
