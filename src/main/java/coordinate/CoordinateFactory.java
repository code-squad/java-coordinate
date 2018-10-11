package coordinate;

import coordinate.controller.FigureMapper;
import coordinate.controller.PointFactory;
import coordinate.domain.*;
import coordinate.dto.CoordinateResult;
import coordinate.view.InputView;
import coordinate.view.ResultView;

import java.util.List;

public class CoordinateFactory {
    public static void main(String[] args) {
        goCoordinate();
    }

    private static void goCoordinate(){
        try{
            List<Point> points = inputCoordinate();
            goFigure(points);
        }catch (IllegalArgumentException | IndexOutOfBoundsException e){
            reEnterCoordinate(e.getMessage());
        }
    }

    private static CoordinateResult makeResultDto(List<Point> points) {
        CoordinateResult result = new CoordinateResult();
        for (Point point : points) {
            result.add(point.pointToDto());
        }
        return result;
    }

    private static void goFigure(List<Point> points){
        FigureMapper mapper = new FigureMapper();
        Figure figure = mapper.getFigure(points);
        ResultView.draw(makeResultDto(points));
        if(figure != null){
            ResultView.showFigureArea(figure.getName(), figure.area());
        }
    }

    private static List<Point> inputCoordinate(){
        String[] coordinate = InputView.getCoordinate();
        return PointFactory.generatePoints(coordinate);
    }

    private static void reEnterCoordinate(String message){
        ResultView.printReEnterMessage(message);
        goCoordinate();
    }
}
