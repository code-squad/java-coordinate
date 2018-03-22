package coordinate.domain;

import java.util.ArrayList;

public class Frame {
	private ArrayList<PointLine> pointLines;

	public Frame(ArrayList<PointLine> pointLines) {
		this.pointLines = pointLines;
	}

	public static Frame init(Coordinates inputCoordinates) {
		ArrayList<PointLine> pointLines = new ArrayList<>();
		for (int yAxis = 0; yAxis < Common.MAXSIZE + 1; yAxis++) {
			PointLine pointLine = PointLine.init(yAxis, inputCoordinates);
			pointLines.add(pointLine);
		}
		return new Frame(pointLines);
	}

	public int size() {
		return pointLines.size();
	}

	public String makeLabel(int i) {
		return pointLines.get(i).makeLabel();
	}

	public String getLine(int i) {
		return pointLines.get(i).getLine();
	}

}
