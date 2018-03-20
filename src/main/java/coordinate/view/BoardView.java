package coordinate.view;

public class BoardView {

	public static void makeBoard() {
		for (int i = 24; i > 0; i--) {
			BoardView.createY(i);
		}
		BoardView.createX();
	}

	public static void createY(int i) {
		if (i % 2 == 0) {
			System.out.printf("%2d", i);
			System.out.println("|");
		} else {
			System.out.print("  ");
			System.out.println("|");
		}
	}

	public static void createX() {
		for (int j = 0; j <= 24; j++) {
			if (j == 0) {
				System.out.print("  +");
			} else{
				System.out.print("──");
			}
		}
		System.out.println();
		for (int j = 0; j <= 24; j++) {
			if (j % 2 == 0) {
				System.out.printf("%3d ", j);
			}
		}
	}
}
