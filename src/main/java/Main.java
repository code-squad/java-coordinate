import domain.Point;
import dto.ResultDto;
import view.ResultView;
import domain.CoordCalculator;
import view.InputView;

import java.util.List;

import static utils.TextParser.parse;

public class Main {
    public static final String NEWLINE = System.getProperty("line.separator");
    public static void main(String[] args) {
        List<Point> points;
        while(true) {
            try {
                points = parse(InputView.getUserInput());
                break;
            } catch(IllegalArgumentException e) {
                System.out.println(NEWLINE + e.getMessage() + NEWLINE);
            }
        }
        CoordCalculator coordCalculator = new CoordCalculator(points);
        ResultDto resultDto = coordCalculator.calculate();
        ResultView.printCoord(resultDto.getPointsDto());
        if(resultDto.getResultValue() != -1) {
            ResultView.printResult(resultDto.getResultValue(), points.size());
        }
    }
}
