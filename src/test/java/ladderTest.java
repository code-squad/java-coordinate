
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ladderTest {
    public double calcaulator(int x1,int y1, int x2, int y2){
        int xLength = (int)Math.pow(x1-x2,2);
        int yLength = (int)Math.pow(y1-y2,2);
        return Math.sqrt(xLength+yLength);
    }

    /* 거리계산하는 로직 */
    @Test
    public void calculator(){
        double length = calcaulator(1,2,1,3);
        assertThat(length).isEqualTo(2);
    }

    /* 숫자 추출하는 로직 */
    @Test
    public void extractNumTest(){
        String input = "(1,1)-(1,2)";
        String[] splited = input.split("(|,|)|-");

        assertThat(splited[4]).isEqualTo("2");
    }
    /**/
}
