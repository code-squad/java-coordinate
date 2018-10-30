package coordinate.domian;

import coordinate.domain.Movement;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MovementTest {

    @Test
    public void 축_위치값(){
        Movement m = new Movement();
        assertThat(m.axis().size()).isEqualTo(25);
    }
}
