package coordinate.util;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilTest {
    @Test
    public void Dash기준분리() {
        String input = "(1,1)-(2,2)";
        String[] inputs = StringUtil.splitStringByDash(input);
        assertThat(inputs.length).isEqualTo(2);
        assertThat(inputs[0]).isEqualTo("(1,1)");
        assertThat(inputs[1]).isEqualTo("(2,2)");
    }

    @Test
    public void 괄호제거() {
        String input = "(1,1)";
        String result = StringUtil.removeParentheses(input);
        assertThat(result).isEqualTo("1,1");
    }

    @Test
    public void Comma기준분리() {
        String input = "1,2";
        String[] result = StringUtil.splitStringByComma(input);
        assertThat(result.length).isEqualTo(2);
        assertThat(result[0]).isEqualTo("1");
        assertThat(result[1]).isEqualTo("2");
    }
}
