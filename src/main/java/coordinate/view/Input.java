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
			List<String> temp = Arrays.asList(coordinates.get(i).split(","));
			inputPoints.addAll(inputPoints(temp));
		}

		return sortYaxis(inputPoints);
	}

	public static ArrayList<Point> inputPoints(List<String> temp) {
		ArrayList<Point> inputPoints = new ArrayList<>();
		for (int i = 0; i < temp.size() - 1; i++) {
			temp.set(i, temp.get(i).replaceAll("[^-?0-9]+", ""));
			temp.set(i + 1, temp.get(i + 1).replaceAll("[^-?0-9]+", ""));
			inputPoints.add(new Point(Integer.parseInt(temp.get(i)), Integer.parseInt(temp.get(i + 1))));
		}

		return inputPoints;
	}

	public static ArrayList<Point> sortYaxis(ArrayList<Point> inputPoints) {
		for (int repeat = 0; repeat < inputPoints.size(); repeat++) {
			for (int i = 0; i < inputPoints.size() - 1; i++) {
				if (inputPoints.get(i).getyAxis() > inputPoints.get(i + 1).getyAxis()) {
					Point temp = new Point(inputPoints.get(i));
					inputPoints.set(i, inputPoints.get(i + 1));
					inputPoints.set(i + 1, temp);
				}
			}
		}
		return sortXaxis(inputPoints);
	}

	public static ArrayList<Point> sortXaxis(ArrayList<Point> inputPoints) {
		for (int repeat = 0; repeat < inputPoints.size(); repeat++) {
			for (int i = 0; i < inputPoints.size() - 1; i++) {
				if (inputPoints.get(i).getxAxis() > inputPoints.get(i + 1).getxAxis()) {
					Point temp = new Point(inputPoints.get(i));
					inputPoints.set(i, inputPoints.get(i + 1));
					inputPoints.set(i + 1, temp);
				}
			}
		}
		return inputPoints;
	}

}
