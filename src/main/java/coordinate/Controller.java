package coordinate;

import java.util.ArrayList;
import coordinate.domain.Point;
import coordinate.view.Input;
import coordinate.view.Print;

public class Controller {
	public static void main(String[] args) {
		// 좌표를 입력받아서 배열에담는다.
		ArrayList<Point> points = Input.inputPoints();
		// 틀을 그린다.
		Print.printFrame(points);
		// 결과출력
		Print.printResult(points);
	}
}