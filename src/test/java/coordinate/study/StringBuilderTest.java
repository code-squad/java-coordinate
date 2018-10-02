package coordinate.study;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

public class StringBuilderTest {
    @Test
    public void test(){
        char escCode = 0x1B;
        int row = 10; int column = 10;
        System.out.print(String.format("%c[%d;%df",escCode,row,column));
    }
}
