package coordinate.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputCoordinate {

	static Scanner scan = new Scanner(System.in);

	public static String Input() { // 좌표입력
		System.out.println("좌표를 입력하세요.");
		String location = scan.nextLine();
		return location;
	}
}
