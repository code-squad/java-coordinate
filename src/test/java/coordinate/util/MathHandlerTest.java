package coordinate.util;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MathHandlerTest {
    @Test
    public void squareNumber(){
        Assertions.assertThat(MathHandler.squareNumber(3)).isEqualTo(9.0);
    }
}
