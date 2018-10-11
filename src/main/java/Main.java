import domain.Point;
import dto.ResultDto;
import view.ResultView;
import domain.CoordCalculator;
import view.InputView;

import java.util.List;

import static utils.TextParser.parse;

public class Main {
    public static void main(String[] args) {
        List<Point> points;
        while(true) {
            try {
                points = parse(InputView.getUserInput());
                break;
            } catch(Exception e) {
                System.out.println("출력 범위를 넘었거나 수가 정상적으로 입력되지 않았습니다. 다시 입력해주세요");
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
