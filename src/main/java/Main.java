import domain.Calculator;
import domain.Graph;

import dto.PointDto;
import view.InputView;
import view.ResultView;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<PointDto> points = InputView.inputCoordinate();

        Graph graph = Graph.init(points);
        ResultView.drawGraph(graph.toDto());
        ResultView.printDistance(Calculator.twoPointsDistance(points));
    }

}
