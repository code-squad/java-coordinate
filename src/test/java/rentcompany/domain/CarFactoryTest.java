package rentcompany.domain;

import org.junit.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarFactoryTest {

    @Test
    public void newInstance(){
      String a = "Avante";
      double b = 300;

      assertThat(CarFactory.newInstance(b).get(a).getName()).isEqualTo(a);

    }
}