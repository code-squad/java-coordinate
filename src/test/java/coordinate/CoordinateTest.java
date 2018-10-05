package coordinate;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinateTest {

    @Test
    public void test11() {
        // 3,2 를 입력받으면
        /*
        * xinput = 3;
        * yinput = 2;
        * coordnateFied.get(2). => line.get(3).makeStar()
        *
        * */
        Coordinate coordinate = new Coordinate();
        coordinate.getCoordinateField().get(0);
    }
    @Test
    public void coordinateLineTest() {
        CoordinateLine coordinateLine = new CoordinateLine();
        assertThat(coordinateLine.getCoordinateLine().size()).isEqualTo(25);
        System.out.println(coordinateLine);
    }

    @Test
    public void displayTest() {
        // 배열을 만들어 0부터 24 한칸씩 띄워 배열을 생성
        // x 축에 0을 포함 y축 그릴땐 0번째 제외
        Coordinate coordinate = new Coordinate();
        new ResultView(coordinate.getCoordinatePanel(),coordinate.getCoordinateField());
    }
    @Test
    public void StringTest() {
        String a = MyString.makeString(4);
        assertThat(a).isEqualTo("  4");
        assertThat(MyString.makeString(3)).isEqualTo("   ");
        assertThat(MyString.makeString(6)).isEqualTo("  6");
    }
}
