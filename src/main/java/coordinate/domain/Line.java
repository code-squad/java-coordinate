package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Line {

	private List<Point> points;
	private int lineY;
	private List<Integer> x;
	private List<Integer> y;

	public Line(List<Integer> x, List<Integer> y, int lineY) {
		this.x = x;
		this.y = y;
		this.lineY = lineY;
		this.points = init();
	}

	public List<Point> init() {      //한줄의 point를 생성
		List<Point> points = new ArrayList<>();
		for (int i = 0; i < 24; i++) {
			checkOverlap(i, points);
		}
		return points;
	}
	
	public void checkOverlap(int i, List<Point> points) { //중복으로 생성하지 않도록 flag 사용
		int flag = produce(points, i);
		if(flag == 0) {
		points.add(Point.makeNomal(i));
		}
	}

	public int produce(List<Point> points, int i) { // 좌표와 빈공간을 생성한다.
		int flag = 0;
		for (int j = 0; j < y.size(); j++) {
			if (IsTrue(i, j)) {
				points.add(Point.coordinate(i));
				flag++;
			}
		}
		return flag;
	}

	public boolean IsTrue(int i, int j) { // x,y값이 좌표면 true
		if (y.get(j) == this.lineY && x.get(j) == i) {
			return true;
		}
		return false;
	}

	public List<Point> getPoints() {
		return this.points;
	}

	public int getY() {
		return this.lineY;
	}

}
