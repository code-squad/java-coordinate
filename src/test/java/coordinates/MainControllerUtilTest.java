package coordinates;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MainControllerUtilTest {

    private MainControllerUtil mainControllerUtil = new MainControllerUtil();

    @Test
    public void axisNum() {
        List<Integer> a = mainControllerUtil.axisNum();
        assertThat(a.size()).isEqualTo(24);
    }

    @Test
    public void reversalAxisNum() {
        List<Integer> a = mainControllerUtil.reversalAxisNum();
        assertThat(a.get(0)).isEqualTo(24);
    }

    @Test
    public void okBlankCondition() {
        int i = 1;
         assertThat(mainControllerUtil.blankCondition(i)).isEqualTo(true);
    }

    @Test
    public void noBlankCondition() {
        List<Integer> a = mainControllerUtil.axisNum();
        int i = 0;
         assertThat(mainControllerUtil.blankCondition(i)).isEqualTo(false);
    }

    @Test
    public void input(){

    }

    public void splitNum(){

    }

    public void changeNum(){

    }

    public void objectCoordinates(int[] input){

    }

    public void splitCoordinate(int num, int[] input){

    }

    public void mathPoint(){
    }

}