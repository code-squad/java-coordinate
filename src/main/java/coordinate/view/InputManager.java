package coordinate.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class InputManager {
	public static ArrayList<HashMap<String, Integer>> inputCoordinate() {

		ArrayList<HashMap<String, Integer>> inputCoordinates = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("좌표를 입력하세요.");
		List<String> coordinates = Arrays.asList(sc.nextLine().split("-"));

		for (int i = 0; i < coordinates.size(); i++) {
			List<String> temp = Arrays.asList(coordinates.get(i).split(","));
			inputCoordinates.add(inputCoordinate(temp));

		}
		sc.close();
		return inputCoordinates;
	}

	public static HashMap<String, Integer> inputCoordinate(List<String> temp) {
		HashMap<String, Integer> coordinate = new HashMap<>();
		for (int j = 0; j < temp.size() - 1; j++) {
			coordinate.put("x", Integer.parseInt(temp.get(j).substring(1, temp.get(j).length())));
			coordinate.put("y", Integer.parseInt(temp.get(j + 1).substring(0, temp.get(j + 1).length() - 1)));
		}
		return coordinate;
	}
}
