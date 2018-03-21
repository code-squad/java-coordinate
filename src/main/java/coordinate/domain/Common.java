package coordinate.domain;

public class Common {
	
	//좌표범위 최대한계값
	public static final int MAXSIZE = 24;
	
	/**
	 * PointLine, PrintManager에서 사용
	 * 파라미터가 홀수인지 계산
	 */
	public static Boolean isOdd(int i) {
		return i % 2 != 0;
	}

}
