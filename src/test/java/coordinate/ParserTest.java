package coordinate;

import coordinate.utill.Parser;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParserTest {
    @Test
    public void desh기준으로_분리() {
        String[] values = Parser.deshSeparator("(1,2)-(3,4)");

        assertThat(values[0]).isEqualTo("(1,2)");
        assertThat(values[1]).isEqualTo("(3,4)");
    }

    @Test
    public void 괄호제거() {
        String[] values = Parser.parenthesisRemove(Parser.deshSeparator("(1,2)-(3,4)"));

        assertThat(values[0]).isEqualTo("1,2");
        assertThat(values[1]).isEqualTo("3,4");
    }
}
