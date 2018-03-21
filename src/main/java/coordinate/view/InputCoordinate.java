package coordinate.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputCoordinate {

	static Scanner scan = new Scanner(System.in);

	public static List<Integer> Input() { // 좌표입력
		System.out.println("좌표를 입력하세요.");
		String location = scan.nextLine();
		try {
			return InputCoordinate.divideNumber(location);
		} catch (IllegalArgumentException e) {
			return InputCoordinate.Input();
		}
	}

	public static List<Integer> divideNumber(String location) {
		location = location.replaceAll("\\(", "");
		location = location.replaceAll("\\)", "");
		location = location.replaceAll("\\-", ",");
		String[] numbers = location.split(",");
		List<Integer> beforeCoordinate = new ArrayList<>();
		for (String i : numbers) {
			if (Integer.parseInt(i) > 24) {
				throw new IllegalArgumentException("24초과의 값은 좌표가 될 수 없습니다.");
			}
			beforeCoordinate.add(Integer.parseInt(i));
		}
		return beforeCoordinate;
	}
}
