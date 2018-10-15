package View;

public class ResultView {


    public static void printLineLength(double len) {
        System.out.println("\n");
        System.out.println("두 점 사이 거리는 " + String.format("%.6f", len));
    }

    public static void printCoordinate(StringBuilder sb) {
        System.out.println(sb);
    }
}