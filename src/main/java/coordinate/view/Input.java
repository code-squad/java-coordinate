package coordinate.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import coordinate.domain.Point;

public class Input {
	public static ArrayList<Point> inputPoints() {
		ArrayList<Point> inputPoints = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("좌표를 입력하세요.");
		List<String> coordinates = Arrays.asList(sc.nextLine().split("-"));

		for (int i = 0; i < coordinates.size(); i++) {
			coordinates.set(i, coordinates.get(i).substring(1, coordinates.get(i).length() - 1));
			inputPoints.add(Point.of(coordinates.get(i)));
		}

		return inputPoints;
	}
}
