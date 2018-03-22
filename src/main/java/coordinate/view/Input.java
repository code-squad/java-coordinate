package coordinate.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import coordinate.domain.Coordinate;

public class Input {
	public static ArrayList<Coordinate> inputCoordinate() {
		ArrayList<Coordinate> inputCoordinates = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("좌표를 입력하세요.");
		List<String> coordinates = Arrays.asList(sc.nextLine().split("-"));

		for (int i = 0; i < coordinates.size(); i++) {
			List<String> temp = Arrays.asList(coordinates.get(i).split(","));
			inputCoordinates.addAll(inputCoordinate(temp));
		}
		sc.close();
		return inputCoordinates;
	}

	public static ArrayList<Coordinate> inputCoordinate(List<String> temp) {
		ArrayList<Coordinate> inputCoordinates = new ArrayList<>();
		for (int i = 0; i < temp.size() - 1; i++) {
			temp.set(i, temp.get(i).replaceAll("[^-?0-9]+", ""));
			temp.set(i + 1, temp.get(i + 1).replaceAll("[^-?0-9]+", ""));
			inputCoordinates.add(new Coordinate(Integer.parseInt(temp.get(i)), Integer.parseInt(temp.get(i + 1))));
		}
		return inputCoordinates;
	}
}
