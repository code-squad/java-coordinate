package coordinate.view;

import coordinate.domain.Figure;

public class PrintResult {
    public static void printLineResult(Figure line) {
        System.out.println();
        System.out.println("두 점 사이의 거리는 : " + line.area());
    }

    public static void printSquareResult(Figure square) {
        System.out.println();
        System.out.println("사각형 넓이는: " + square.area());
    }

    public static void printTriangleResult(Figure triangle) {
        System.out.println();
        System.out.println("삼각형 넓이는: " + triangle.area());
    }

}
