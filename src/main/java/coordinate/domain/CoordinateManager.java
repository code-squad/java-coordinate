package coordinate.domain;

import java.util.ArrayList;
import java.util.HashMap;

public class CoordinateManager {
	private ArrayList<PointLine> pointLines;

	public CoordinateManager(ArrayList<PointLine> pointLines) {
		this.pointLines = pointLines;
	}

	public static CoordinateManager init(ArrayList<HashMap<String, Integer>> inputCoordinates) {
		ArrayList<PointLine> pointLines = new ArrayList<>();
		for (int yAxis = 0; yAxis < Common.MAXSIZE + 1; yAxis++) {
			PointLine pointLine = PointLine.init(yAxis, inputCoordinates);
			pointLines.add(pointLine);
		}
		return new CoordinateManager(pointLines);
	}

	public int size() {
		return pointLines.size();
	}

	public String getLabel(int i) {
		return pointLines.get(i).getLabel();
	}

	public PointLine getPointLine(int i) {
		return pointLines.get(i);
	}

	public String getLine(int i) {
		return pointLines.get(i).getLine();
	}

	public int getPointsSize(int i) {
		return pointLines.get(i).getPoints().size();
	}

}
