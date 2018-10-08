package coord.view;

import coord.domain.Figure;

public class OutputView {
    public static void printSize(Figure figure) {
        System.out.println(figure.figureKind() + "의 크기는");
        System.out.println(figure.size());
    }

    public static void printGridPaper(String gridPaper) {
        System.out.println(gridPaper);
    }
}
