import domain.Figure;
import static view.InputView.*;
import static view.ResultView.*;

public class Main {

    public static void main(String[] args) {
        Figure figure = makeFigure();

        System.out.println(drawGraph(figure));
        System.out.println(figure.printArea());
    }

}
