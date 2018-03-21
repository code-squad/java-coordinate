package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class MakeXY {

	private List<Integer> x;
	private List<Integer> y;

	public MakeXY(List<Integer> number) {
		this.x = makeX(number);
		this.y = makeY(number);
	}

	public List<Integer> makeX(List<Integer> number) {
		List<Integer> x = new ArrayList<>();
		int tmp;
		for (int i = 0; i < number.size(); i += 2) {
			tmp = number.get(i);
			x.add(tmp);
		}
		return x;
	}

	public List<Integer> makeY(List<Integer> number) {
		List<Integer> y = new ArrayList<>();
		int tmp;
		for (int i = 1; i < number.size(); i += 2) {
			tmp = number.get(i);
			y.add(tmp);
		}
		return y;
	}

	public List<Integer> getX() {
		return this.x;
	}

	public List<Integer> getY() {
		return this.y;
	}
}
