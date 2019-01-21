package connrdinates;

import connrdinates.domain.*;
import connrdinates.util.MainControllerUtil;
import connrdinates.view.InputView;
import connrdinates.view.ResultView;
import org.slf4j.Logger;


import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

public class MainController {
    
    private static final Logger log = getLogger(MainController.class);
    
    public static void main(String[] args) {
        List<Point> point = MainControllerUtil.alignmentNumber(InputView.pointInput());

//        Figure figure = new Rectangle(point);
        Figure a = new Line(point);

        ResultView.graphWidthLine(point);
        ResultView.height();
//        ResultView.area(figure);
        ResultView.area(a);
    }
}
