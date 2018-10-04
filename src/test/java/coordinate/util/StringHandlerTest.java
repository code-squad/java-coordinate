package coordinate.util;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

public class StringHandlerTest {

    @Test(expected = NumberFormatException.class)
    public void parseIntegers(){
        String[] ss = {"1", "2", "3,"};
        StringHandler.parseIntegers(ss);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void cutBracket(){
        String s = "s";
        StringHandler.cutBracket(s);
    }

    @Test
    public void trimString(){
        String s = "(1,  1)-(2,2)";
        assertThat(StringHandler.trimString(s)).isEqualTo("(1,1)-(2,2)");
    }
}
