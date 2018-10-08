package coordinate;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinateTest {

    @Test
    public void displayTest() {
        // 배열을 만들어 0부터 24 한칸씩 띄워 배열을 생성
        // x 축에 0을 포함 y축 그릴땐 0번째 제외
        Coordinate coordinate = new Coordinate();
        coordinate.displayYCoordinate();
        coordinate.displayXCoordinate();
    }
    @Test
    public void StringTest() {
        String a = MyString.makeString(4);
        assertThat(a).isEqualTo("  4");
        assertThat(MyString.makeString(3)).isEqualTo("   ");
        assertThat(MyString.makeString(6)).isEqualTo("  6");
    }
}
