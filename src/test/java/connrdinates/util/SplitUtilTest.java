package connrdinates.util;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SplitUtilTest {

    private SplitUtil splitUtil = new SplitUtil();

    @Test
    public void changeNum() {
        String a = "(1,1)-(2,2)";
        assertThat(splitUtil.changeNum(a).size()).isEqualTo(4);
    }
}