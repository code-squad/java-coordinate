package coordinate.view;

import coordinate.domain.Line;
import coordinate.domain.Square;

public class PrintResult {
    public static void printLineResult(Line line) {
        System.out.println();
        System.out.println("두 점 사이의 거리는 : " + line.calculateLineDistance());
    }

    public static void printSquareResult(Square sqaure) {
        System.out.println();
        System.out.println("사각형 넓이는: " + sqaure.getSquareArea());
    }
}
