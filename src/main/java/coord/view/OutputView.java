package coord.view;

import coord.domain.Area;
import coord.domain.Figure;

public class OutputView {
    public static void printKind(Figure figure) {
        System.out.println(figure.figureKind() + "의 크기는");
    }

    public static void printSize(Area area) {
        System.out.println(area.area());
    }

    public static void printGridPaper(String gridPaper) {
        System.out.println(gridPaper);
    }
}
